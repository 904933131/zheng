package com.zheng.test.dao.model;

import java.io.Serializable;

public class SysUser implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8802916623436843078L;
	
	private Long id;//主键id
    private String loginName;//登陆名
    private String password;//密码
    private String salt;//盐
    private String realName;//真实姓名
    private Integer sex;//性别(0=男 1=女)
    private Integer age;//年龄
    private java.util.Date birth;//出生年月
    private String phone;//手机号
    private String companyId;//所属单位
    private String email;//邮箱
    private String remark;//备注
    private java.util.Date lastLogin;//最后登录时间
    private Integer locked;//用户状态 （0=开启 1 关闭）
    private java.util.Date createTime;//创建时间
    private Long createUser;//创建人
    private java.util.Date updateTime;//数据更新时间
    private Long updateUser;//更新人
    private Integer isDelete;//删除标志（0=正常 1=删除）
	
	private Long roleId;
	/*公司名称*/
	private String companyName;
	
    public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
    public SysUser() {
        super();
    }
    public SysUser(Long id, String loginName, String password, String salt, String realName, Integer sex, Integer age, java.util.Date birth, String phone, String companyId, String email, String remark, java.util.Date lastLogin, Integer locked, java.util.Date createTime, Long createUser, java.util.Date updateTime, Long updateUser, Integer isDelete) {
        super();
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.salt = salt;
        this.realName = realName;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
        this.phone = phone;
        this.companyId = companyId;
        this.email = email;
        this.remark = remark;
        this.lastLogin = lastLogin;
        this.locked = locked;
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

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public java.util.Date getBirth() {
        return this.birth;
    }

    public void setBirth(java.util.Date birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public java.util.Date getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(java.util.Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getLocked() {
        return this.locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
	@Override
	public String toString() {
		return "SysUser [id=" + id + ", loginName=" + loginName + ", password=" + password + ", realName=" + realName
				+ ", sex=" + sex + ", age=" + age + ", birth=" + birth + ", phone=" + phone + ", companyId=" + companyId
				+ ", email=" + email + ", remark=" + remark + ", lastLogin=" + lastLogin + ", locked=" + locked
				+ ", createTime=" + createTime + ", createUser=" + createUser + ", updateTime=" + updateTime
				+ ", updateUser=" + updateUser + ", isDelete=" + isDelete + ", roleId=" + roleId + "]";
	}

}
