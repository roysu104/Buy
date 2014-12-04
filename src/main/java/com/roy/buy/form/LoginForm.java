package com.roy.buy.form;

import java.util.ArrayList;
import java.util.List;

/**
 * 登入表單
 */
public class LoginForm {
	
	/** 帳號 */
	private String account;
	
	/** 密碼 */
	private String password;
	
	/** 錯誤訊息 */
	private List<String> errorMessage = new ArrayList<String>();
	
	/**
	 * 驗證 RegisterForm, 若驗證失敗回傳 true
	 */
	public boolean validateFail() {
		errorMessage.clear();
		if(account.length() == 0) {
			errorMessage.add("帳號不能空著哦！");
		}
		if(password.length() == 0) {
			errorMessage.add("密碼不能空著哦！");
		}
		return errorMessage.size() > 0;
	}
	
	/**
	 * 取得驗證失敗的錯誤訊息
	 */
	public List<String> getErrorMessage() {
		return errorMessage;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
