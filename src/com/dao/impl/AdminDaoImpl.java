package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.Admin;
import com.dao.AdminDao;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao{
	
 
    public List<Admin> findAll() {
        // TODO Auto-generated method stub
        return getHibernateTemplate().find("from com.bean.Admin");
    }
 
    public Admin findAdminByNameAndPass(String username, String password) {
        // TODO Auto-generated method stub
        System.out.println("验证管理员。。。");
        //delete(1);    //从数据库的test表中，成功删除一条记录
        //String[] args = {username , password};
           
        List ul = getHibernateTemplate().find("from com.bean.Admin ad where ad.name = '"+ username+"' and ad.password = '"+ password+"'");
 
        if (ul.size() == 1)
        {
            System.out.println("OK");
            return (Admin)ul.get(0);
        }
        return null;
 
    }
 
    public Admin get(Integer id) {
        // TODO Auto-generated method stub
        return (Admin)getHibernateTemplate().get(Admin.class , id);
    }
 
	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}
}
