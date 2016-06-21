package com.service.impl;

import java.util.List;

import com.bean.User;
import com.dao.UserDao;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userdao;
	
    public UserDao getUserdao() {//����spring����ע�룬���setter��getter������get/set+ǰ�涨��ı����������������������СдҪ��ǰ��һ��������ֻ�ܵ�һ����ĸ��д
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
              User user = userdao.findUserByCardNumber(cardnumber);//�ж�ѧ���Ƿ��Ѵ���
              if (user!= null)
              {
                 return 0;//�Ѵ���
              }
              if(!password.equals(confirpassword))
              {
            	 return 2;//�����������벻һ��
              }
        }
        catch (Exception e)
        {
               System.out.println(e.getMessage());
        }
        //������serviceֱ�Ӳ�����bean���о���Ӧ��������ȷ���벻���õİ취
        User user = new User();
        user.setSid(cardnumber);
        user.setPassword(password);
        user.setName(name);
        userdao.save(user);
        return 1;//ע��ɹ�
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
