package com.action;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;


/**
 * @author 闫博   
 * 管理员登陆
 *
 */
public class SuperLoginAction extends ActionSupport{

	protected AdminService as;     //该对象采用 Spring 依赖注入
	   
	//接受值
    private String adminname;
    private String password;
    //返回值
    private String flag;

    //Spring依赖注入的对象必须有get、set方法。方法命名规则：get+变量名。为了便于记忆，变量名第一个字母可以大写。
    public void setAs(AdminService as)   
    {
        this.as = as;
    }
    
    public AdminService getAs()
    {
        return this.as;
    }
 
    public String execute() throws Exception {
        System.out.println("点击登录");
        if(adminname.equals("") || password.equals("")){
        	flag = "nullinput";
            return "FAILURE";
        }
       
        Integer userId = as.validLogin(adminname, password);
       
        if (userId != null) {
            System.out.println("合法用户");
            System.out.print("将管理员信息保存到session");
            Map attibutes = ActionContext.getContext().getSession();  
            attibutes.put("admin",adminname);  
            return "SUCCESS";
        } else {
            System.out.println("非法用户");
            flag = "passworderror";
            return "FAILURE";
        }
    }
 
    public String getPassword() {//必须有get和set action才能自动接受表单的值
        return password;
    }
 
    public String getAdminname() {
        return adminname;
    }
 
    public void setPassword(String password) {//这里参数的值也必须和前台页面对应的name一样
        this.password = password;
    }
 
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
   
}
