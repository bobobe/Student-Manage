package com.service.impl;

import com.bean.Admin;
import com.bean.User;
import com.dao.AdminDao;
import com.dao.UserDao;
import com.service.AdminService;

public class AdminServiceImpl implements AdminService{
    private AdminDao admindao;
	
    public AdminDao getAdmindao() {//对于spring依赖注入，这个setter和getter规则是get/set+前面定义的变量名，并且这个变量名大小写要和前面一样，或者只能第一个字母大写
		return admindao;
	}

	public void setAdmindao(AdminDao admindao) {
		this.admindao = admindao;
	}
 
    public Integer validLogin(String username, String password){
      
            try {
            	  Admin admin = admindao.findAdminByNameAndPass(username, password);
                  if (admin!= null)
                  {
                     return admin.getId();
                  }
            }
            catch (Exception e)
            {
                   System.out.println(e.getMessage());
            }
             return null;
    }
}
