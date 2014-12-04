package com.roy.buy.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roy.buy.dao.IUserDao;
import com.roy.buy.entity.User;
import com.roy.buy.exception.DataCheckException;
import com.roy.buy.service.IUserService;

/**
 * 會員相關操作 Service 實作
 */
@Service("userService")
@Transactional
public class UserService implements IUserService {
	
	/** 自動注入 UserDao */
	@Autowired
	private IUserDao userDao;

	/**
	 * 會員註冊
	 */
	@Override
	public void register(User user) throws DataCheckException {
		// 驗證是否有相同帳號
		User validateAccountUser = userDao.findByAccount(user.getAccount());
		if(validateAccountUser != null) {
			throw new DataCheckException(1);
		}			
		// 驗證是否有相同Email
		User validateEmailUser = userDao.findByEmail(user.getEmail());
		if(validateEmailUser != null) {
			throw new DataCheckException(2);
		}
		userDao.save(user);
	}

	/**
	 * 會員登入
	 */
	@Override
	public User login(String account, String password)
			throws DataCheckException {
		// 確認是否有此會員
		User user = userDao.findByAccount(account);
		if(user == null) {
			throw new DataCheckException(11);
		}
		// 確認密碼是否正確
		String enterPassword = DigestUtils.md5Hex(password);
		if(!enterPassword.equals(user.getPassword())) {
			throw new DataCheckException(12);
		}
		return user;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}