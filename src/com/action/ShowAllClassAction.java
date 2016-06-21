package com.action;

import java.util.List;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookService;
import com.service.ClassService;


/**
 * @author 闫博   
 * 显示所有班级信息
 *
 */
public class ShowAllClassAction extends ActionSupport {


			//服务采用 Spring 依赖注入
			protected ClassService cs;  
			
			//返回值
			private List<Class> classlist;
			private String flag;
			
			
			//主方法
		    public String execute() throws Exception {
		        System.out.println("获取所有班级信息");
		        classlist = cs.showAllClass();
		        flag = "showallclass";
		        return "SUCCESS";
		    }
		    
		    //getter和setter
			public String getFlag() {
				return flag;
			}

			public void setFlag(String flag) {
				this.flag = flag;
			}

			
		    //Spring依赖注入的对象必须有get、set方法。方法命名规则：get+变量名。为了便于记忆，变量名第一个字母可以大写。
		    public void setCs(ClassService cs)   
		    {
		        this.cs = cs;
		    }
		    
		    public ClassService getCs()
		    {
		        return this.cs;
		    }

			public List<Class> getClasslist() {
				return classlist;
			}

			public void setClasslist(List<Class> classlist) {
				this.classlist = classlist;
			}

}
