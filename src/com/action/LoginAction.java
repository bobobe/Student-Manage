package com.action;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;


import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 学生端登陆
 *
 */
public class LoginAction extends ActionSupport {//login控制器
	
	    //采用 Spring 依赖注入
	    protected UserService us;     

	    //返回值
	    private String flag;
		private String cardnumber;
	    private String password;

	    //Spring依赖注入的对象必须有get、set方法。方法命名规则：get+变量名。为了便于记忆，变量名第一个字母可以大写。
	    public void setUs(UserService us)   
	    {
	        this.us = us;
	    }
	    
	    public UserService getUs()
	    {
	        return this.us;
	    }
	 
	    public String execute() throws Exception {
	        System.out.println("点击登录");
	        if(cardnumber.equals("") || cardnumber == null){
	        	flag = "nullinput";
	            return "FAILURE";
	        }
	       
	        Integer userid = us.validLogin(cardnumber, password);
	       
	        if (userid != null) {
	            System.out.println("合法用户");
	            flag = "success";
	            
	            //用户信息保存到session
	            User user = us.getUserdao().findUserByCardNumber(cardnumber);
	            Map attibutes = ActionContext.getContext().getSession();  
	            attibutes.put("user",user);  
	            
	           return "SUCCESS";
	        } else {
	            //addActionError("用户名/密码不匹配");
	            System.out.println("非法用户");
	            flag = "passworderror";
	            return "FAILURE";
	        }
	    }
	 
	    public String getPassword() {//必须有get和set action才能自动接受表单的值
	        return password;
	    }
	 
	    public String getCardnumber() {
	        return cardnumber;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
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

