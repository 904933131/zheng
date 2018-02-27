package com.zheng.test.dao;


import com.zheng.test.common.constant.ConstantFieldUtil;
import com.zheng.test.dao.model.SysUser;
import org.apache.shiro.SecurityUtils;

/**
 * 辅助方法
 * @author LW
 * 2017/11/23
 */
public class ConstantMethodUtil {
	/**
	 * 用户辅助方法
	 */
	public static SysUser getSysUser(){
		return (SysUser)SecurityUtils.getSubject().getPrincipal();
	}
	//获取当前登录用户单位信息
	public static String getUserCompanyId() {return getSysUser().getCompanyId();}
	// 获取当前登录用户权限 管理员为0
	public static Long getUserRoleId() {return getSysUser().getRoleId();}
	 // 获取当前登录用户ID
	public static Long getUserId() { return getSysUser().getId();}
	 // true 管理员
	public static boolean getIsAdmin() { return getUserRoleId().equals(ConstantFieldUtil.SYS_USER_IS_ADMIN) ? true  : false; }
	 // 获取登录用户公司ID
	public static String getIsCompanyId() { return getSysUser().getCompanyId(); }
	
	/**
	 * 分页插件辅助方法
	 */
	public static  int getPageStart(Integer pageindex, Integer pageSize) {
		return (pageindex - 1) * pageSize;
	}
}

