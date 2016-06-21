package com.service.impl;

import java.util.List;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userdao;
	
    public UserDao getUserdao() {//对于spring依赖注入，这个setter和getter规则是get/set+前面定义的变量名，并且这个变量名大小写要和前面一样，或者只能第一个字母大写
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	public List<User> showAllStudent()
	{
		return userdao.findAll();
	}
    
	public int validRegister(String name,String password,String confirpassword,String cardnumber){
	      
        try {
              User user = userdao.findUserByCardNumber(cardnumber);//判断学号是否已存在
              if (user!= null)
              {
                 return 0;//已存在
              }
              if(!password.equals(confirpassword))
              {
            	 return 2;//两次输入密码不一样
              }
        }
        catch (Exception e)
        {
               System.out.println(e.getMessage());
        }
        //这里用service直接操作了bean，感觉不应该这样，确又想不出好的办法
        User user = new User();
        user.setSid(cardnumber);
        user.setPassword(password);
        user.setName(name);
        userdao.save(user);
        return 1;//注册成功
    }
	
    public Integer validLogin(String cardnumber, String password){
      
            try {
                  User user = userdao.findUserByNumberAndPass(cardnumber, password);
                  if (user!= null)
                  {
                     return user.getId();
                  }
            }
            catch (Exception e)
            {
                   System.out.println(e.getMessage());
            }
             return null;
    }

	@Override
	public User searchStudentBycardnumber(String cardnumber) {
		// TODO Auto-generated method stub
		return userdao.findUserByCardNumber(cardnumber);
	}

	@Override
	public User searchStudentByName(String name) {
		// TODO Auto-generated method stub
		return userdao.findUserByName(name);
	}

	@Override
	public int delStudentById(Integer id) {
		// TODO Auto-generated method stubs
		userdao.delete(id);
		return 1;
	}

	@Override
	public int updateStudent(User user) {
		// TODO Auto-generated method stub
		userdao.update(user);
		return 1;
	}

	@Override
	public int addStudent(User user) {
		// TODO Auto-generated method stub
		userdao.save(user);
		return 1;
	}

	@Override
	public List<User> searchStudentByCid(String cid) {
		// TODO Auto-generated method stub
		return userdao.findUserByCid(cid);
	}
	
	@Override
	public List<User> searchStudentByDorm(String dormname) {
		// TODO Auto-generated method stub
		return userdao.findUserByDorm(dormname);
	}

}
