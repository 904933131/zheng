package com.zheng.test.dao.mapper;


import com.zheng.common.db.Assist;
import com.zheng.test.dao.model.TbVehicleType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbVehicleTypeDao {
	
	/**
	 * 按条件获取车型总数
	 * @param companyId  当前登录用户所属公司ID
	 * @param qTypeCode	
	 * @param engineCode
	 * @return
	 */
	Long getTbTypeVehiclesCount(@Param("isAdmin") boolean isAdmin, @Param("companyId") String companyId,
								@Param("qTypeCode") String qTypeCode, @Param("engineCode") String engineCode,
								@Param("qfullType") String qfullType);

	// 获取车辆类型集合
	List getTbTypeVehicles(@Param("isAdmin") boolean isAdmin, @Param("companyId") String companyId,
						   @Param("qTypeCode") String qTypeCode, @Param("engineCode") String engineCode,
						   @Param("qfullType") String qfullType, @Param("pageStart") Integer pageStart, @Param("pageEnd") Integer pageEnd);
	
	/**
	 * 获得TbVehicleType数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getTbVehicleTypeRowCount(Assist assist);
	/**
	 * 获得TbVehicleType数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<TbVehicleType> selectTbVehicleType(Assist assist);
	/**
	 * 获得一个TbVehicleType对象,以参数TbVehicleType对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    TbVehicleType selectTbVehicleTypeByObj(TbVehicleType obj);
	/**
	 * 通过TbVehicleType的id获得TbVehicleType对象
	 * @param id
	 * @return
	 */
    TbVehicleType selectTbVehicleTypeById(Long id);
	/**
	 * 插入TbVehicleType到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertTbVehicleType(TbVehicleType value);
	/**
	 * 插入TbVehicleType中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyTbVehicleType(TbVehicleType value);
	/**
	 * 通过TbVehicleType的id删除TbVehicleType
	 * @param id
	 * @return
	 */
    int deleteTbVehicleTypeById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除TbVehicleType
	 * @param assist
	 * @return
	 */
    int deleteTbVehicleType(Assist assist);
	/**
	 * 通过TbVehicleType的id更新TbVehicleType中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateTbVehicleTypeById(TbVehicleType enti);
 	/**
	 * 通过辅助工具Assist的条件更新TbVehicleType中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateTbVehicleType(@Param("enti") TbVehicleType value, @Param("assist") Assist assist);
	/**
	 * 通过TbVehicleType的id更新TbVehicleType中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyTbVehicleTypeById(TbVehicleType enti);
 	/**
	 * 通过辅助工具Assist的条件更新TbVehicleType中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyTbVehicleType(@Param("enti") TbVehicleType value, @Param("assist") Assist assist);
}