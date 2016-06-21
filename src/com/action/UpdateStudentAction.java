package com.action;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;


/**
 * @author �Ʋ�   
 * ����ѧ����Ϣ
 *
 */
public class UpdateStudentAction extends ActionSupport{
	protected UserService us;
	
	//���ܵ�ֵ
    private User student;
    private String sid;
    
    //����
    private String flag;
   	
	
	public String execute() throws Exception {
		if(student == null)
		{
			System.out.print("չʾ���±�");
			flag = "showupdateform";
			return "SHOWFORM";
		}
		System.out.print("����ѧ����Ϣ");
		System.out.print(student.getId());
		us.updateStudent(student);
		
		System.out.print("�����º���û����浽session");
        Map attibutes = ActionContext.getContext().getSession();  
        attibutes.put("user",student);
		return "SUCCESS";
	}
	
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}

	public User getStudent() {
		return student;
	}

	public String getSid() {
		return sid;
	}

	public String getFlag() {
		return flag;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
