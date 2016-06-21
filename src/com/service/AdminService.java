package com.service;

import com.dao.AdminDao;
import com.dao.UserDao;

public interface AdminService {
	
	    Integer validLogin(String username , String password);
	    public AdminDao getAdmindao();
	    public void setAdmindao(AdminDao admin);
}
