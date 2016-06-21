package com.action;

import java.util.List;

import com.bean.Book;
import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookService;
import com.service.UserService;


/**
 * @author 闫博   
 * 显示全部图书借阅信息
 *
 */
public class ShowAllBookAction extends ActionSupport{

	        //服务采用 Spring 依赖注入
			protected BookService bs;  
			
			//返回值
			private List<Book> booklist;
			private String flag;
			
			
			//主方法
		    public String execute() throws Exception {
		        System.out.println("获取所有图书信息");
		        booklist = bs.showAllBook();
		        flag = "showallbook";
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
		    public void setBs(BookService bs)   
		    {
		        this.bs = bs;
		    }
		    
		    public BookService getBs()
		    {
		        return this.bs;
		    }

			public List<Book> getBooklist() {
				return booklist;
			}

			public void setBooklist(List<Book> booklist) {
				this.booklist = booklist;
			}
}
