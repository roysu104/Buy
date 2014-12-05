package com.roy.buy.service;

import java.util.List;

import com.roy.buy.entity.Category;

/**
 * 介面：商品類別
 */
public interface ICategoryService {
	
	/**
	 * 新增類別
	 */
	public void addParent(Category category);
	
	/**
	 * 取得父類別列表
	 */
	public List<Category> getParentList();

}
