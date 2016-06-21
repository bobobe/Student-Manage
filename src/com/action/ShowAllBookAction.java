package com.action;

import java.util.List;

import com.bean.Book;
import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookService;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ��ʾȫ��ͼ�������Ϣ
 *
 */
public class ShowAllBookAction extends ActionSupport{

	        //������� Spring ����ע��
			protected BookService bs;  
			
			//����ֵ
			private List<Book> booklist;
			private String flag;
			
			
			//������
		    public String execute() throws Exception {
		        System.out.println("��ȡ����ͼ����Ϣ");
		        booklist = bs.showAllBook();
		        flag = "showallbook";
		        return "SUCCESS";
		    }
		    
		    //getter��setter
			public String getFlag() {
				return flag;
			}

			public void setFlag(String flag) {
				this.flag = flag;
			}

			
		    //Spring����ע��Ķ��������get��set������������������get+��������Ϊ�˱��ڼ��䣬��������һ����ĸ���Դ�д��
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
