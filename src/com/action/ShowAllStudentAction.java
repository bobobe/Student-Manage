package com.action;

import java.util.List;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ��ʾȫ��ѧ����Ϣ
 *
 */
public class ShowAllStudentAction extends ActionSupport{

	//������� Spring ����ע��
		protected UserService us;  
		
		//����ֵ
		private List<User> userlist;
		private String flag;
		
		
		//������
	    public String execute() throws Exception {
	        System.out.println("��ȡ����ѧ����Ϣ");
	        userlist = us.showAllStudent();
	        flag = "showallstudent";
	        return "SUCCESS";
	    }
	    
	    //getter��setter
		public List<User> getUserlist() {
			return userlist;
		}

		public void setUserlist(List<User> userlist) {
			this.userlist = userlist;
		}
		
		public String getFlag() {
			return flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}

		
	    //Spring����ע��Ķ��������get��set������������������get+��������Ϊ�˱��ڼ��䣬��������һ����ĸ���Դ�д��
	    public void setUs(UserService us)   
	    {
	        this.us = us;
	    }
	    
	    public UserService getUs()
	    {
	        return this.us;
	    }

	
	 
}
