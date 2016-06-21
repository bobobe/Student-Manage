package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.bean.Fee;
import com.dao.FeeDao;

public class FeeDaoImpl extends HibernateDaoSupport implements FeeDao {


	@Override
	public List<Fee> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from com.bean.Fee f where f.isHand = 0");
	}

	//修改学生是否已缴纳学费(已废)
	@Override
	public void update(Fee fee) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(fee);
		
	}

	//修改学生是否已缴纳学费(利用HQL语句)
	@Override
	public void updatefeestatus(String sid) {
		// TODO Auto-generated method stub
		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
		SessionFactory sf  = (SessionFactory)wac.getBean("sessionFactory"); 
		Session session = sf.openSession();
        session.beginTransaction();  
        Query query = session.createQuery("update com.bean.Fee t set t.isHand = '1' where t.sid = '"+sid+"'");  
        query.executeUpdate();  
        session.getTransaction().commit();  
	}

}
