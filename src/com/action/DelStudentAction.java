package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

/**
 * @author 闫博   
 * 删除学生
 *
 */
public class DelStudentAction extends ActionSupport{
	
	protected UserService us;
	
	//接受值
	private Integer id;
	
	public String execute() throws Exception {

		us.delStudentById(id);
        return "SUCCESS";
        
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	} 
}
