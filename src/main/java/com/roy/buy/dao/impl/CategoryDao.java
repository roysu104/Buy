package com.roy.buy.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.roy.buy.dao.ICategoryDao;
import com.roy.buy.entity.Category;

/**
 * 實作：商品類別
 */
@Service("categoryDao")
public class CategoryDao extends BaseDao<Category> implements ICategoryDao {
	
	/**
	 * 於建構子使用 BaseDao 建構子, 傳入Entity Class
	 */
	public CategoryDao() {
		super(Category.class);
	}

	@Override
	public List<Category> findByParent(int parent) {
		return super.findListBy("parent", parent);
	}

}
