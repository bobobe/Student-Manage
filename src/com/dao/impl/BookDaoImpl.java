package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Book;
import com.dao.BookDao;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

	public BookDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from com.bean.Book");
	}

}
