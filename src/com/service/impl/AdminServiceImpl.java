package com.service.impl;

import com.bean.Admin;
import com.bean.User;
import com.dao.AdminDao;
import com.dao.UserDao;
import com.service.AdminService;

public class AdminServiceImpl implements AdminService{
    private AdminDao admindao;
	
    public AdminDao getAdmindao() {//����spring����ע�룬���setter��getter������get/set+ǰ�涨��ı����������������������СдҪ��ǰ��һ��������ֻ�ܵ�һ����ĸ��д
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
