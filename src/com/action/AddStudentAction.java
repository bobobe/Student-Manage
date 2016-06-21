package com.action;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

/**
 * @author �Ʋ�   
 * ���ѧ��
 *
 */
public class AddStudentAction extends ActionSupport{

	protected UserService us;
	
	//����ֵ
    private User user;
	
	public String execute() throws Exception {

		us.addStudent(user);
        return "SUCCESS";
        
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
