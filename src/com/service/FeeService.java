package com.service;

import java.util.List;

import com.bean.Dorm;
import com.bean.Fee;

public interface FeeService {
	public List<Fee> showAllFee();//�������з�����Ϣ
	
	//�޸�ѧ���Ͻ�ѧ��״̬
	public void updateHandFee(Fee fee);
	
	public void handInFee(String sid);

}
