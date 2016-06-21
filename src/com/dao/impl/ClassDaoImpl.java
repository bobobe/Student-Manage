package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.ClassDao;

public class ClassDaoImpl extends HibernateDaoSupport implements ClassDao {

	public ClassDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Class> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from com.bean.Class");
	}

}
