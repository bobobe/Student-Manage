package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 按参数查找学生信息
 *
 */
public class SearchStudentAction extends ActionSupport {

	protected UserService us;
	
	//接受值
	private int type;//按type查询
	private String value;//值
	
	//返回值
	User user;
	String flag;
	
	
	public String execute() throws Exception {
        System.out.println("按type查询");
        if(value==null)
        {
        	flag = "searchstudentform";
        	return "SHOWFORM";
        }
        switch(type)
        {
	        case 0 ://按学号
	        user = us.searchStudentBycardnumber(value);
	        	break;
	        case 1://按姓名
	        user = us.searchStudentByName(value);
	            break;
        }
        if(user!=null)
        {
        	flag = "searchstudentsuccess";
        	 //用户信息保存到session
        	System.out.print("将用户保存到session");
            Map attibutes = ActionContext.getContext().getSession();  
            attibutes.put("user",user);  
        }
        else
        {
        	flag = "searchstudentnotfound";
        }
        return "SUCCESS";
    }

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}


	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
