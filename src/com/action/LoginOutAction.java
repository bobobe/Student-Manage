package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

/**
 * @author 闫博   
 * 退出登陆
 *
 */
public class LoginOutAction extends ActionSupport {
	//采用 Spring 依赖注入
    protected UserService us;     

    //主方法
    public String execute() throws Exception {
        System.out.println("点击退出");

        //销毁session
        Map attibutes = ActionContext.getContext().getSession();  
        attibutes.put("user",null);
        attibutes.put("admin", null);//销毁管理员的session
        return "SUCCESS";
   }
}
