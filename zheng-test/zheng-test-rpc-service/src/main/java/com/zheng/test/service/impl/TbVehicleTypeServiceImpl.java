package com.zheng.test.service.impl;



import com.zheng.common.db.Assist;
import com.zheng.common.db.DataSourceAnnotation;
import com.zheng.test.common.constant.ConstantFieldUtil;
import com.zheng.test.dao.ConstantMethodUtil;
import com.zheng.test.dao.api.TbVehicleTypeService;
import com.zheng.test.dao.mapper.TbVehicleTypeDao;
import com.zheng.test.dao.model.TbVehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TbVehicleTypeServiceImpl implements TbVehicleTypeService {
	@Autowired
	private TbVehicleTypeDao tbVehicleTypeDao;
	@Override
	@DataSourceAnnotation(value="read")
	public Long getTbVehicleTypeCount(String qTypeCode, String engineCode, String qfullType) {
		return tbVehicleTypeDao.getTbTypeVehiclesCount(ConstantMethodUtil.getIsAdmin(),ConstantMethodUtil.getUserCompanyId(),
				 qTypeCode, engineCode, qfullType);
	}

	@Override
	@DataSourceAnnotation(value="read")
	public List getTbVehicleType(String id, String engineCode, String qfullType, Integer pageindex, Integer pageSize)
			throws Exception {
		//获取条件查询的结果集
		List<Map<String, Object>> maps = tbVehicleTypeDao.getTbTypeVehicles(ConstantMethodUtil.getIsAdmin(),ConstantMethodUtil.getUserCompanyId(),
				 id, engineCode, qfullType, ConstantMethodUtil.getPageStart(pageindex, pageSize), pageSize);
		//遍历结果集
		for (Map<String, Object> map : maps) {
			Long typeId = (Long) map.get(ConstantFieldUtil.DB_File_STRING_ID);
			TbVehicleType vehicleType = selectTbVehicleTypeById(typeId);
			map.put(ConstantFieldUtil.DB_File_STRING_PARAMS, vehicleType.getParams()); //填充 监控信息
		}
		return maps;
	}

	@Override
	@DataSourceAnnotation(value="write")
	public int deleteById(Long id) throws Exception {
		TbVehicleType vehicleType = selectTbVehicleTypeById(id);
		vehicleType.setIsDelete(ConstantFieldUtil.TABLE_COMMON_DELETE);		//修改删除状态
		return tbVehicleTypeDao.updateNonEmptyTbVehicleTypeById(vehicleType);
	}

	@Override
	@DataSourceAnnotation(value="write")
	public void saveOrUpdate(TbVehicleType vehicleType) throws Exception {
		covertParams(vehicleType);
		if (null == vehicleType.getId()) {	//为空时 新增，填充用户信息
			vehicleType.setCreateTime(new Date());
			vehicleType.setCreateUser(String.valueOf(ConstantMethodUtil.getUserId()));
			vehicleType.setIsDelete(ConstantFieldUtil.TABLE_COMMON_NOT_DELETE);
			insertNonEmptyTbVehicleType(vehicleType);
		} else {	//修改时 填充用户信息
			vehicleType.setUpdateTime(new Date());
			vehicleType.setUpdateUser(String.valueOf(ConstantMethodUtil.getUserId()));
			updateNonEmptyTbVehicleTypeById(vehicleType);
		}
	}

	/**
	 *  根据前台传递的 如 params [1,5 ,6 ] 的监控信息 去动态调用该对象的 set xxx方法
	 * @param vehicleType
	 */
	public void covertParams(TbVehicleType vehicleType) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String[] params = vehicleType.getParams(); //获取监控信息
		Map<String, String> paramMaps = ConstantFieldUtil.VEHICLE_TYPE_PARAMS_MAP_METHOD; // 获取所有监控信息集合
		for (String key : paramMaps.keySet()) {// 首先将对象所有监控信息设置为 不监控
			vehicleType.getClass()
					.getMethod("set" + ConstantFieldUtil.VEHICLE_TYPE_PARAMS_MAP_METHOD.get(key),
							new Class[] { Integer.class })
					.invoke(vehicleType, ConstantFieldUtil.VEHICLE_TYPE_NOT_MONITOR);
		}
		for (String param : params) {	// 根据参数调用设置监控状态
			// 使用代理调用方法
			vehicleType.getClass().getMethod("set" + ConstantFieldUtil.VEHICLE_TYPE_PARAMS_MAP_METHOD.get(param),
					new Class[] { Integer.class }).invoke(vehicleType, ConstantFieldUtil.VEHICLE_TYPE_MONITOR);
		}
	}
	/**
	 *  查询车型信息，并填充params
	 */
	@DataSourceAnnotation(value="read")
	@Override
	public TbVehicleType selectTbVehicleTypeById(Long id) throws Exception {
		TbVehicleType tbVehicleType = tbVehicleTypeDao.selectTbVehicleTypeById(id);
		List<String> paramsList = new ArrayList<>();
		Class vehicleClass = tbVehicleType.getClass();
		Map<String, String> paramMaps = ConstantFieldUtil.VEHICLE_TYPE_PARAMS_MAP_METHOD; // 获取集合
		for (String key : paramMaps.keySet()) {
			int falg = (int) vehicleClass.getMethod("get" + paramMaps.get(key)).invoke(tbVehicleType); // 通过反射
			// 调用getxxx方法
			if (falg == ConstantFieldUtil.VEHICLE_TYPE_MONITOR) {
				paramsList.add(key); // 如 [ 1 , 5,6 ]数据 数据标识已监控
			}
		}
		tbVehicleType.setParams(paramsList.toArray(new String[] {})); //将对象装换成数组
		if (tbVehicleType.getIsDelete() == ConstantFieldUtil.TABLE_COMMON_DELETE) {
			return null;
		}
		return tbVehicleType;
	}
	
	@Override
	@DataSourceAnnotation(value="read")
	public List<Object> getListByCompany(String companyId) {
		Assist assist = new Assist();
		assist.setRequires(
				//Assist.andEq(ConstantFieldUtil.DB_File_COMPANY_ID, companyId),
				Assist.andEq(ConstantFieldUtil.DB_File_IS_DELETE, ConstantFieldUtil.TABLE_COMMON_NOT_DELETE));
		List  modelList = tbVehicleTypeDao.selectTbVehicleType(assist);
		return modelList;
	}

	@Override
	public long getTbVehicleTypeRowCount(Assist assist) {
		return tbVehicleTypeDao.getTbVehicleTypeRowCount(assist);
	}

	@Override
	public List<TbVehicleType> selectTbVehicleType(Assist assist) {
		return tbVehicleTypeDao.selectTbVehicleType(assist);
	}

	@Override
	public TbVehicleType selectTbVehicleTypeByObj(TbVehicleType obj) {
		return tbVehicleTypeDao.selectTbVehicleTypeByObj(obj);
	}

	@Override
	public int insertTbVehicleType(TbVehicleType value) {
		return tbVehicleTypeDao.insertTbVehicleType(value);
	}

	@Override
	public int insertNonEmptyTbVehicleType(TbVehicleType value) {
		return tbVehicleTypeDao.insertNonEmptyTbVehicleType(value);
	}

	@Override
	public int deleteTbVehicleTypeById(Long id) {
		return tbVehicleTypeDao.deleteTbVehicleTypeById(id);
	}

	@Override
	public int deleteTbVehicleType(Assist assist) {
		return tbVehicleTypeDao.deleteTbVehicleType(assist);
	}

	@Override
	public int updateTbVehicleTypeById(TbVehicleType enti) {
		return tbVehicleTypeDao.updateTbVehicleTypeById(enti);
	}

	@Override
	public int updateTbVehicleType(TbVehicleType value, Assist assist) {
		return tbVehicleTypeDao.updateTbVehicleType(value, assist);
	}

	@Override
	public int updateNonEmptyTbVehicleTypeById(TbVehicleType enti) {
		return tbVehicleTypeDao.updateNonEmptyTbVehicleTypeById(enti);
	}

	@Override
	public int updateNonEmptyTbVehicleType(TbVehicleType value, Assist assist) {
		return tbVehicleTypeDao.updateNonEmptyTbVehicleType(value, assist);
	}

	public TbVehicleTypeDao getTbVehicleTypeDao() {
		return this.tbVehicleTypeDao;
	}

	public void setTbVehicleTypeDao(TbVehicleTypeDao tbVehicleTypeDao) {
		this.tbVehicleTypeDao = tbVehicleTypeDao;
	}

}