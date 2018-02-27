package com.zheng.test.dao.model;
public class TbVehicleType {
    private Long id;//id
    private String typeCode;//车型编号
    private String engineCode;//发动机型号
    private String fuelType;//燃油类型
    private String remark;//车型描述
    private Integer paramRpm;//转速
    private Integer paramSpeed;//车速
    private Integer paramFuelConsumption;//瞬态燃料消耗
    private Integer paramAcceleratorStatus;//踏板行程 0:否 1:是
    private Integer paramEnginePressure;//增压压力 0:否 1:是
    private Integer paramAirTemperature;//进气温度 0:否 1:是
    private Integer paramFuelTemperature;//燃油温度 0:否 1:是
    private Integer paramOilPressure;//机油压力 0:否 1:是
    private Integer paramWaterTemperature;//水温0:否 1:是
    private Integer paramBatteryVoltage;//电池电压 0:否 1:是
    private java.util.Date createTime;//创建时间
    private String createUser;//创建人
    private java.util.Date updateTime;//修改时间
    private String updateUser;//修改人
    private Integer isDelete;//删除状态 （0=正常 1=删除）
    
    private String params [];
    
    public TbVehicleType() {
        super();
    }
    public TbVehicleType(Long id, String typeCode, String engineCode, String fuelType, String remark, Integer paramRpm, Integer paramSpeed, Integer paramFuelConsumption, Integer paramAcceleratorStatus, Integer paramEnginePressure, Integer paramAirTemperature, Integer paramFuelTemperature, Integer paramOilPressure, Integer paramWaterTemperature, Integer paramBatteryVoltage, java.util.Date createTime, String createUser, java.util.Date updateTime, String updateUser, Integer isDelete) {
        super();
        this.id = id;
        this.typeCode = typeCode;
        this.engineCode = engineCode;
        this.fuelType = fuelType;
        this.remark = remark;
        this.paramRpm = paramRpm;
        this.paramSpeed = paramSpeed;
        this.paramFuelConsumption = paramFuelConsumption;
        this.paramAcceleratorStatus = paramAcceleratorStatus;
        this.paramEnginePressure = paramEnginePressure;
        this.paramAirTemperature = paramAirTemperature;
        this.paramFuelTemperature = paramFuelTemperature;
        this.paramOilPressure = paramOilPressure;
        this.paramWaterTemperature = paramWaterTemperature;
        this.paramBatteryVoltage = paramBatteryVoltage;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.isDelete = isDelete;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeCode() {
        return this.typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getEngineCode() {
        return this.engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getParamRpm() {
        return this.paramRpm;
    }

    public void setParamRpm(Integer paramRpm) {
        this.paramRpm = paramRpm;
    }

    public Integer getParamSpeed() {
        return this.paramSpeed;
    }

    public void setParamSpeed(Integer paramSpeed) {
        this.paramSpeed = paramSpeed;
    }

    public Integer getParamFuelConsumption() {
        return this.paramFuelConsumption;
    }

    public void setParamFuelConsumption(Integer paramFuelConsumption) {
        this.paramFuelConsumption = paramFuelConsumption;
    }

    public Integer getParamAcceleratorStatus() {
        return this.paramAcceleratorStatus;
    }

    public void setParamAcceleratorStatus(Integer paramAcceleratorStatus) {
        this.paramAcceleratorStatus = paramAcceleratorStatus;
    }

    public Integer getParamEnginePressure() {
        return this.paramEnginePressure;
    }

    public void setParamEnginePressure(Integer paramEnginePressure) {
        this.paramEnginePressure = paramEnginePressure;
    }

    public Integer getParamAirTemperature() {
        return this.paramAirTemperature;
    }

    public void setParamAirTemperature(Integer paramAirTemperature) {
        this.paramAirTemperature = paramAirTemperature;
    }

    public Integer getParamFuelTemperature() {
        return this.paramFuelTemperature;
    }

    public void setParamFuelTemperature(Integer paramFuelTemperature) {
        this.paramFuelTemperature = paramFuelTemperature;
    }

    public Integer getParamOilPressure() {
        return this.paramOilPressure;
    }

    public void setParamOilPressure(Integer paramOilPressure) {
        this.paramOilPressure = paramOilPressure;
    }

    public Integer getParamWaterTemperature() {
        return this.paramWaterTemperature;
    }

    public void setParamWaterTemperature(Integer paramWaterTemperature) {
        this.paramWaterTemperature = paramWaterTemperature;
    }

    public Integer getParamBatteryVoltage() {
        return this.paramBatteryVoltage;
    }

    public void setParamBatteryVoltage(Integer paramBatteryVoltage) {
        this.paramBatteryVoltage = paramBatteryVoltage;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
	public String[] getParams() {
		return params;
	}
	public void setParams(String[] params) {
		this.params = params;
	}

}
