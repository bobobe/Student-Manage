package com.service;

import java.util.List;

import com.bean.User;
import com.dao.UserDao;

public interface UserService {
	    //自定义服务
	    Integer validLogin(String cardnumber , String password);//验证登录
	    int validRegister(String name,String password,String confirpassword,String cardnumber);//验证注册
	    public List<User> showAllStudent();//返回所有用户信息
	    public User searchStudentBycardnumber(String cardnumber);
	    public User searchStudentByName(String name);
	    public List<User> searchStudentByCid(String cid);
	    public List<User> searchStudentByDorm(String dormname);
	    public int delStudentById(Integer id);
	    public int updateStudent(User user);
	    public int addStudent(User user);
	    
        //依赖注入
	    public UserDao getUserdao();
	    public void setUserdao(UserDao userdao);
}
