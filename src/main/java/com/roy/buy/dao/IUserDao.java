package com.roy.buy.dao;

import com.roy.buy.entity.User;

/**
 * 介面：會員
 */
public interface IUserDao extends IBaseDao<User> {

	/**
	 * 根據帳號查詢, 若查詢不到回傳 null
	 */
	public User findByAccount(String account);
	
	/**
	 * 根據 EMail 查詢, 若查詢不到回傳 null
	 */
	public User findByEmail(String email);

}