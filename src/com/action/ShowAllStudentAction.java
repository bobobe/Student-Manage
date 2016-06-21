package com.action;

import java.util.List;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 显示全部学生信息
 *
 */
public class ShowAllStudentAction extends ActionSupport{

	//服务采用 Spring 依赖注入
		protected UserService us;  
		
		//返回值
		private List<User> userlist;
		private String flag;
		
		
		//主方法
	    public String execute() throws Exception {
	        System.out.println("获取所有学生信息");
	        userlist = us.showAllStudent();
	        flag = "showallstudent";
	        return "SUCCESS";
	    }
	    
	    //getter和setter
		public List<User> getUserlist() {
			return userlist;
		}

		public void setUserlist(List<User> userlist) {
			this.userlist = userlist;
		}
		
		public String getFlag() {
			return flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}

		
	    //Spring依赖注入的对象必须有get、set方法。方法命名规则：get+变量名。为了便于记忆，变量名第一个字母可以大写。
	    public void setUs(UserService us)   
	    {
	        this.us = us;
	    }
	    
	    public UserService getUs()
	    {
	        return this.us;
	    }

	
	 
}
