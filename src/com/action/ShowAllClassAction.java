package com.action;

import java.util.List;

import com.bean.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookService;
import com.service.ClassService;


/**
 * @author �Ʋ�   
 * ��ʾ���а༶��Ϣ
 *
 */
public class ShowAllClassAction extends ActionSupport {


			//������� Spring ����ע��
			protected ClassService cs;  
			
			//����ֵ
			private List<Class> classlist;
			private String flag;
			
			
			//������
		    public String execute() throws Exception {
		        System.out.println("��ȡ���а༶��Ϣ");
		        classlist = cs.showAllClass();
		        flag = "showallclass";
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
