package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Admin;
import com.bean.Card;
import com.dao.CardDao;

public class CardDaoImpl extends HibernateDaoSupport implements CardDao {


	@Override
	public List<Card> findCardBySid(Integer sid) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from com.bean.Card cd where cd.sid = "+ sid);
	}

}
