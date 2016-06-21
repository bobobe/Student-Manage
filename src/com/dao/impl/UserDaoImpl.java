package com.dao.impl;
import java.util.List;
import com.dao.UserDao;
import com.bean.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	 public void delete(Integer id) {
	        // TODO Auto-generated method stub
	        getHibernateTemplate().delete(getHibernateTemplate().get(User.class , id));
	    }
	 
	    public void delete(User user) {
	        // TODO Auto-generated method stub
	        getHibernateTemplate().delete(user);
	    }
	 
	    public List<User> findAll() {
	        // TODO Auto-generated method stub
	        return getHibernateTemplate().find("from com.bean.User");
	    }
	 
	    public User findUserByNumberAndPass(String cardnumber, String password) {
	        // TODO Auto-generated method stub
	        System.out.println("验证用户");
	        
	        System.out.println("成功");
	           
	        List ul = getHibernateTemplate().find("from com.bean.User au where au.sid = '"+ cardnumber+"' and au.password = '"+ password+"'");
	 
	        if (ul.size() == 1)
	        {
	            System.out.println("OK");
	            return (User)ul.get(0);
	        }
	        return null;
	 
	    }
	    
	    public User findUserByCardNumber(String cardnumber) {
	        // TODO Auto-generated method stub
	        System.out.println("根据学号查找用户。。");
	           
	        List ul = getHibernateTemplate().find("from com.bean.User au where au.sid = '"+ cardnumber+"'");
	 
	        if (ul.size() == 1)
	        {
	            System.out.println("Already exists");
	            return (User)ul.get(0);
	        }
	        return null;
	 
	    }
	    
	    @Override
		public User findUserByName(String name) {
			// TODO Auto-generated method stub
	    	 System.out.println("根据姓名查找用户。。");
	           
		        List ul = getHibernateTemplate().find("from com.bean.User au where au.name = '"+ name+"'");
		 
		        if (ul.size() == 1)
		        {
		            System.out.println("存在此用户");
		            return (User)ul.get(0);
		        }
		        return null;
		}
	    
	    public List<User> findUserByCid(String cid) {
			// TODO Auto-generated method stub
	    	 System.out.println("根据班级查找用户。。");
	           
		        List ul = getHibernateTemplate().find("from com.bean.User au where au.cid = '"+ cid+"'");
		 
		        if (ul.size()!=0)
		        {
		            System.out.println("该班级存在学生");
		            return ul;
		        }
		        System.out.println("该班级不存在学生");
		        return null;
		}
	 
	    public User get(Integer id) {
	        // TODO Auto-generated method stub
	        return (User)getHibernateTemplate().get(User.class , id);
	    }
	 
	    public void save(User user) {
	        // TODO Auto-generated method stub
	        getHibernateTemplate().save(user);
	    }
	 
	    public void update(User user) {
	        // TODO Auto-generated method stub
	        getHibernateTemplate().saveOrUpdate(user);
	    }

		@Override
		public List<User> findUserByDorm(String dormname) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	    	 System.out.println("根据宿舍查找用户。。"+dormname);
	           
		        List ul = getHibernateTemplate().find("from com.bean.User au where au.dorm = '"+ dormname+"'");
		 
		        if (ul.size()!=0)
		        {
		            System.out.println("该宿舍存在学生");
		            return ul;
		        }
		        System.out.println("该宿舍不存在学生");
		        return null;
		}
	    
}
