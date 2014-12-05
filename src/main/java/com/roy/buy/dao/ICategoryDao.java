package com.roy.buy.dao;

import java.util.List;

import com.roy.buy.entity.Category;

/**
 * 介面：商品類別
 */
public interface ICategoryDao extends IBaseDao<Category> {

	/**
	 * 根據父類別欄位查詢, 若查詢不到回傳 null
	 */
	public List<Category> findByParent(int parent);

}
