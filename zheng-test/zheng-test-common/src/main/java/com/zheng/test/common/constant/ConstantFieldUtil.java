package com.zheng.test.common.constant;

import java.util.HashMap;
import java.util.Map;

public class ConstantFieldUtil {
	/**
	 * 用户表 禁用状态  0 开启 1 关闭
	 */
	public static final Integer  SYS_USER_LOCKED = 1;
	
	public static final Integer  SYS_USER_UNLOCKED = 0;
	
	/**
	 * 是管理员权限ID
	 */
	public static final Long SYS_USER_IS_ADMIN = 1l;
	
	/**
	 * 通用属性 是否删除 0 否 1 是
	 */
	public static final Integer  TABLE_COMMON_NOT_DELETE = 0;
	
	public static final Integer  TABLE_COMMON_DELETE = 1;
	
	/**
	 * 是否安装 0 否 1 是
	 */
	public static final Integer  SYS_TABLE_IS_NOT_INSTALL = 0;
	
	public static final Integer  SYS_TABLE_IS_INSTALL = 1;
	
	/**
	 * 车型类型 监控指标
	 * 由于对应 tb_vehicle_type 中字段 
	 */
	public static final Map<String,String> VEHICLE_TYPE_PARAMS_MAP_SHOW = new HashMap<>();
	
	static
	{
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("1", "转速");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("2", "车速");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("3", "瞬态燃料消耗");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("4", "踏板行程");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("5", "增压压力");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("6", "进气温度");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("7", "燃油温度");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("8", "机油压力");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("9", "水温");
		VEHICLE_TYPE_PARAMS_MAP_SHOW.put("10", "电池电压");
	}
	
	/**
	 * 车型类型 设置监控方法
	 */
	public static final Map<String,String> VEHICLE_TYPE_PARAMS_MAP_METHOD = new HashMap<>();
	
	static
	{
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("1", "ParamRpm");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("2", "ParamSpeed");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("3", "ParamFuelConsumption");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("4", "ParamAcceleratorStatus");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("5", "ParamEnginePressure");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("6", "ParamAirTemperature");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("7", "ParamFuelTemperature");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("8", "ParamOilPressure");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("9", "ParamWaterTemperature");
		VEHICLE_TYPE_PARAMS_MAP_METHOD.put("10", "ParamBatteryVoltage");
	}
	
	//车型监控 启动 1   不启动 0
	public static final Integer VEHICLE_TYPE_MONITOR = 1;
	
	public static final Integer VEHICLE_TYPE_NOT_MONITOR = 0;
	/**
	 * 数据库列的字段
	 */
	public static final String DB_File_STRING_ID = "id";
	public static final String DB_File_STRING_PARAMS = "params";
	public static final String DB_File_COMPANY_ID = "company_id";
	public static final String DB_File_IS_DELETE = "is_delete";
	public static final String DB_File_SIM_NO = "sim_no";
	public static final String DB_File_SIM_ID = "sim_id";
	public static final String DB_File_MODEL_ID = "model_id";
	public static final String DB_File_MODEL_CODE = "model_code";
	public static final String DB_File_VEHICLE_VIN = "vehicle_vin";
	public static final String DB_File_DRIVE_PHONE = "driver_phone";
	public static final String DB_File_LEVEL = "level";
	
	/**
	 * ajax响应
	 */
	public static final String AJAX_RETURN_SUCCESS = "200";
	public static final String AJAX_RETURN_ERROR = "300";

	
	/**
	 * 查询所有
	 */
	public static final Integer DB_FILED_QUERYY_ALL = -1;
	
	/**
	 * 男女性别
	 */
	public static final Integer TABLE_COMMON_SEX_MAN = 100701;
	public static final Integer TABLE_COMMON_SEX_WOMAN = 100702;
	
	/**
	 * 男女性别
	 */
	public static final String TABLE_COMMON_SEX_MAN_STR = "男";
	public static final String TABLE_COMMON_SEX_WOMAN_STR = "女";
	
	public static final String COMPANY_HTML_SPEACE ="&nbsp;&nbsp;&nbsp;";

	public static final String INPORTY_SOURCE_PATH = "/resource/uploadFile";

	public static final String INPORT_EXCEL_SIM_STR = "SIM";
	public static final String [] IMPORT_EXCEL_SIM_TITLE = {"*所属单位","*sim卡"};
}

