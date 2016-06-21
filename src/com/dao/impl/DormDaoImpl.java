package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Dorm;
import com.dao.DormDao;

public class DormDaoImpl extends HibernateDaoSupport implements DormDao {

	public DormDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Dorm> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from com.bean.Dorm");
	}

}
