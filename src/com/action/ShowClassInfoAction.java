package com.action;

import java.util.List;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class ShowClassInfoAction extends ActionSupport{
	   private UserService us;
	   //接受值
	   private String cid;
	   
	   //返回值
	   private String flag;
	   private List<User> userlist;
	   
    public String execute() throws Exception {
        System.out.println("根据班级返回学生信息");
        userlist = us.searchStudentByCid(cid);
        flag = "showstudentbyclass";
        return "SUCCESS";
    }    

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}

	public List<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}
	
}
