package com.roy.buy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roy.buy.constant.View;
import com.roy.buy.entity.Category;
import com.roy.buy.service.ICategoryService;

/**
 * 管理後台 Controller
 */
@Controller
@RequestMapping("/Admin")
public class AdminController {

	/** 自動注入 CategoryService */
	@Autowired
	private ICategoryService categoryService;

	/**
	 * 管理後台首頁
	 */
	@RequestMapping(value = "Home")
	public String home() {
		return View.ADMIN_HOME;
	}
	
	/**
	 * 新增父類別表單
	 */
	@RequestMapping(value = "AddCategoryParentForm")
	public String addCategoryParentForm() {
		return View.ADMIN_ADD_CATEGORY_PARENT;
	}

	/**
	 * 新增父類別
	 */
	@RequestMapping(value = "SaveCategoryParent")
	public String saveCategoryParent(String categoryName) {
		categoryService.addParent(new Category(categoryName, 0));
		return View.ADMIN_HOME;
	}
	
	/**
	 * 新增子類別表單
	 */
	@RequestMapping(value = "AddCategoryChildForm")
	public String addCategoryChildForm(Model model) {
		model.addAttribute("parentList", categoryService.getParentList());
		return View.ADMIN_ADD_CATEGORY_CHILD;
	}

	/**
	 * 新增子類別
	 */
	@RequestMapping(value = "SaveCategoryChild")
	public String saveCategoryChild(int parent, String categoryName) {
		categoryService.addParent(new Category(categoryName, parent));
		return View.ADMIN_HOME;
	}
}
