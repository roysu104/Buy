package com.roy.buy.controller;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roy.buy.constant.View;
import com.roy.buy.entity.User;
import com.roy.buy.exception.DataCheckException;
import com.roy.buy.form.LoginForm;
import com.roy.buy.service.IUserService;

/**
 * 會員 Controller
 */
@Controller
@RequestMapping("/User")
public class UserController {

	/** 自動注入 UserService */
	@Autowired
	private IUserService userService;

	/**
	 * 會員登入
	 */
	@RequestMapping(value = "Login")
	public String login(Model model, LoginForm form, HttpSession session) {
		// 若驗證失敗, 導向登入表單
		if(form.validateFail()) {
			model.addAttribute("errorMessage", form.getErrorMessage());
			model.addAttribute("loginFrom", form);
			return View.LOGIN_FORM;
		}
		
		try {
			User user = userService.login(form.getAccount(), form.getPassword());
			session.setAttribute("validUser", user);
		} catch(DataCheckException e) {
			model.addAttribute("errorMessage", Arrays.asList(e.getMessage()));
			model.addAttribute("loginFrom", form);
			return View.LOGIN_FORM;
		}
		
		return View.REDIRECT_HOME;
	}

	/**
	 * 會員登出
	 */
	@RequestMapping(value = "Logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return View.REDIRECT_HOME;
	}

}
