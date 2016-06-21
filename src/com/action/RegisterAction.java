package com.action;

import java.io.InputStream;
import java.io.PrintWriter;


import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author 闫博   
 * 注册
 *
 */
public class RegisterAction extends ActionSupport {//login控制器
	 //private static final long serialVersionUID = 1L;
	 
	    protected UserService us;     //该对象采用 Spring 依赖注入

	    //返回值
	    private String flag;
		private String cardnumber;
	    private String password;
	    private String confirpassword;

		private String name;

		public String execute() throws Exception {
	        System.out.println("点击注册");
	        if(name.equals("")|| password.equals("")||confirpassword.equals("")){
	        	flag = "nullinput";
	            return "FAILURE";
	        }
	       
	        int tag = us.validRegister(name,password,confirpassword,cardnumber);
	       
	        if (tag == 0) {
	            System.out.println("已被注册");
	            flag = "alreadyexists";
	           return "FAILURE";
	        } else if(tag == 2){
	        	flag = "两次输入密码不一样";
	            System.out.println("密码不同");
	            flag = "passworderror";
	            return "FAILURE";
	        }
	        else
	        {
	        	System.out.println("注册成功");
	            flag = "success";
	            return "SUCCESS";
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
	    
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getConfirpassword() {
			return confirpassword;
		}

		public void setConfirpassword(String confirpassword) {
			this.confirpassword = confirpassword;
		}
	    
	    public String getFlag() {//返回给jsp页面的值也需要加get和set
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

