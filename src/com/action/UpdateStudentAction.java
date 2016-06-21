package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 更新学生信息
 *
 */
public class UpdateStudentAction extends ActionSupport{
	protected UserService us;
	
	//接受的值
    private User student;
    private String sid;
    
    //返回
    private String flag;
   	
	
	public String execute() throws Exception {
		if(student == null)
		{
			System.out.print("展示更新表单");
			flag = "showupdateform";
			return "SHOWFORM";
		}
		System.out.print("更新学生信息");
		System.out.print(student.getId());
		us.updateStudent(student);
		
		System.out.print("将更新后的用户保存到session");
        Map attibutes = ActionContext.getContext().getSession();  
        attibutes.put("user",student);
		return "SUCCESS";
	}
	
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}

	public User getStudent() {
		return student;
	}

	public String getSid() {
		return sid;
	}

	public String getFlag() {
		return flag;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
