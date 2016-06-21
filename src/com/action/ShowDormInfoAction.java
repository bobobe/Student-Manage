package com.action;

import java.util.List;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 显示指定宿舍信息
 *
 */
public class ShowDormInfoAction extends ActionSupport{
	   private UserService us;
	   //接受值
	   private String dormname;//宿舍名字
	   
	   //返回值
	   private String flag;
	   private List<User> userlist;
	   
    public String execute() throws Exception {
        System.out.println("根据宿舍返回学生信息"+dormname);
        userlist = us.searchStudentByDorm(dormname);
        flag = "showstudentbydorm";
        return "SUCCESS";
    }    

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public String getDormname() {
		return dormname;
	}

	public void setDormname(String dormname) {
		this.dormname = dormname;
	}
	
}
