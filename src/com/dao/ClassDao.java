package com.dao;

import java.util.List;

import com.bean.Book;

public interface ClassDao {

		  /**
	   * 查询班级信息
	   * @return list<Class>
	   */
	  List<Class> findAll();
}
