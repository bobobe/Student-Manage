package com.service;

import java.util.List;

import com.bean.User;
import com.dao.UserDao;

public interface UserService {
	    //�Զ������
	    Integer validLogin(String cardnumber , String password);//��֤��¼
	    int validRegister(String name,String password,String confirpassword,String cardnumber);//��֤ע��
	    public List<User> showAllStudent();//���������û���Ϣ
	    public User searchStudentBycardnumber(String cardnumber);
	    public User searchStudentByName(String name);
	    public List<User> searchStudentByCid(String cid);
	    public List<User> searchStudentByDorm(String dormname);
	    public int delStudentById(Integer id);
	    public int updateStudent(User user);
	    public int addStudent(User user);
	    
        //����ע��
	    public UserDao getUserdao();
	    public void setUserdao(UserDao userdao);
}
