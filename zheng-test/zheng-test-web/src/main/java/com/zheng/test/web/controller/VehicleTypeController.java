package com.zheng.test.web.controller;

import com.zheng.test.common.constant.ConstantFieldUtil;
import com.zheng.test.common.constant.Result;
import com.zheng.test.dao.api.TbVehicleTypeService;
import com.zheng.test.dao.model.TbVehicleType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/vehicleType")
public class VehicleTypeController {
	
	private static Logger logger = LoggerFactory.getLogger(VehicleTypeController.class);
	
	@Autowired
	private TbVehicleTypeService tbVehicleTypeService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String toListPage() {
		return "tbPage/vehicleType/list";
	}

	@RequestMapping(value = "ajax/list", method = RequestMethod.POST)
	@ResponseBody
	public Result getVehicleTypes(
            @RequestParam(required = false) String qTypeCode,
            @RequestParam(required = false) String qVengineCode,
            @RequestParam(required = false) String qfullType,
            @RequestParam(required = false) Integer pageindex, @RequestParam(required = false) Integer pageSize) throws Exception {
		Result<TbVehicleType> result = new Result<>();
		Long count = tbVehicleTypeService.getTbVehicleTypeCount(qTypeCode, qVengineCode, qfullType);
		List data = tbVehicleTypeService.getTbVehicleType(qTypeCode, qVengineCode, qfullType,pageindex,pageSize);
		result.setDataList(data);
		result.setTotalCount(count);
		return result;
	}
	
	@RequestMapping(value="/ajax/delete/{id}",method= RequestMethod.POST)
	@ResponseBody
	public Result deleteByVehicleTypesId(@PathVariable("id") Long id){
		Result<TbVehicleType> result = new Result<>();
		try {
			int falg = tbVehicleTypeService.deleteById(id);
			if(falg != 1){
				result.setMessage("该数据删除失败");
			}
		} catch (Exception e) {
			result.setCode(400);
			result.setMessage("删除失败,原因："+e.getMessage());
		}
		return result;
	}
	

	@RequestMapping(value={"/ajax/save","/ajax/update"},method= RequestMethod.POST)
	@ResponseBody
	public Result<TbVehicleType> saveOrupdate(@RequestBody TbVehicleType vehicleType) throws Exception{
		Result<TbVehicleType> result = new Result<TbVehicleType>();
		tbVehicleTypeService.saveOrUpdate(vehicleType);
		return result;
	}
	
	@RequestMapping(value="/ajax/getVehicleTypeId/{id}",method= RequestMethod.POST)
	@ResponseBody
	public Result<TbVehicleType> getVehicleTypeId(@PathVariable("id") Long id) throws Exception{
		Result<TbVehicleType> result = new Result<TbVehicleType>();
		TbVehicleType vehicleType =  tbVehicleTypeService.selectTbVehicleTypeById(id);
		Map<String,TbVehicleType>  map = new HashMap<>();
		map.put("vehicleType", vehicleType);
		result.setDataMap(map);
		return result;
	}
	
	/**
	 * 获取监控名称
	 */
	@RequestMapping(value="/ajax/paramsList",method= RequestMethod.GET)
	@ResponseBody
	public Object getParams(Model model, HttpSession session) {
			Map<String,String> params  = ConstantFieldUtil.VEHICLE_TYPE_PARAMS_MAP_SHOW;
			return params;
	}
	
	/**
	 * 根据公司查询对应车型
	 */

	@RequestMapping(value="/ajax/getListByCompany/{companyId}",method= RequestMethod.GET)
	@ResponseBody
	public Object getListByCompany(@PathVariable("companyId") String companyId) {
			List<Object> simList = tbVehicleTypeService.getListByCompany(companyId);
			return simList;
	}
	
}
