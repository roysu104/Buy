package com.roy.buy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roy.buy.dao.ICategoryDao;
import com.roy.buy.entity.Category;
import com.roy.buy.service.ICategoryService;

/**
 * 實作：商品類別
 */
@Service("categoryService")
@Transactional
public class CategoryService implements ICategoryService {
	
	/** 自動注入 CategoryDao */
	@Autowired
	private ICategoryDao categoryDao;

	@Override
	public void addParent(Category category) {
		categoryDao.save(category);
	}

	@Override
	public List<Category> getParentList() {
		return categoryDao.findByParent(0);
	}

	public void setCategoryDao(ICategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

}
