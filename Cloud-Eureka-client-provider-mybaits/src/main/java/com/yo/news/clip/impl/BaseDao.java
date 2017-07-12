package com.yo.news.clip.impl;

public interface BaseDao<T>
{
	int deleteByPrimaryKey(Object key);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Object key);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
 

}
