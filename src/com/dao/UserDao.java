package com.dao;
import java.util.List;

import com.bean.*;

public interface UserDao {

	 
	    /**
	     * 根据id查找用户
	     * @param id 需要查找的用户id
	     */ 
	    User get(Integer id);
	    /**
	     * 增加用户
	     * @param user 需要增加的用户
	     */      
	    void save(User user);
	 
	    /**
	     * 修改用户
	     * @param user 需要修改的用户
	     */ 
	    void update(User user);
	 
	    /**
	     * 删除用户
	     * @param id 需要删除的用户id
	     */ 
	    void delete(Integer id);
	 
	    /**
	     * 删除用户
	     * @param user 需要删除的用户
	     */ 
	    void delete(User user);
	 
	    /**
	     * 查询全部用户
	     * @return 获得全部用户
	     */
	    
	    List<User> findAll();
	 
	    /**
	     * 根据用户名，密码查找用户
	     * @param username 查询所需的用户名
	     * @param pass 查询所需的密码
	     * @return 对应的用户
	     */
	    User findUserByNumberAndPass(String cardnumber , String password);
	    /**
	     * 根据学号查找用户
	     * @param cardnumber 查询所需的学号
	     * @return 对应的用户
	     */
	    User findUserByCardNumber(String cardnumber);
	    /**
	     * 根据班级查找用户
	     * @param cid 查询所需的班级号
	     * @return 对应的用户
	     */
	    List<User> findUserByCid(String cid);
	    /**
	     * 根据宿舍查找用户
	     * @param dormname 查询所需的宿舍名
	     * @return 对应的用户
	     */
	    List<User> findUserByDorm(String dormname);
	    /**
	     * 根据名字查找用户
	     * @param dormname 查询所需的用户名
	     * @return 对应的用户
	     */
		User findUserByName(String name);
	    


}
