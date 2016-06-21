package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 显示指定学生全部信息
 *
 */
public class UserInfoAction extends ActionSupport{
	
	//服务采用 Spring 依赖注入
	protected UserService us;  
	
    //接收值
	private String cardnumber;
	
	//返回值
	private User user;
	private String flag;
	
	//主方法
    public String execute() throws Exception {
        System.out.println("获取用户信息");
        user = us.getUserdao().findUserByCardNumber(cardnumber);
        flag = "searchstudentsuccess";
        //用户信息保存到session
    	System.out.print("将用户保存到session");
        Map attibutes = ActionContext.getContext().getSession();  
        attibutes.put("user",user);  
        return "SUCCESS";
    }
    
    //getter和setter
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
 
}
