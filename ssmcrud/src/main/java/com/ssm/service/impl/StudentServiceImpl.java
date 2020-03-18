package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.StudentMapper;
import com.ssm.dao.UsersMapper;
import com.ssm.service.StudentService;
/*�������4�з�ʽ��
 *  @Component	���Զ����κ���
 *  @Controller	����Springmvc��controllerΪ���
 *  @Repository	����daoΪ���
 *  @Service	����Service��Ϊ���
 * */

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public boolean studentLogin(String username, String password) {
		String p = studentMapper.selectPasswordByName(username);
		if(password.equals(p)) {
			return true;
		} else {
			return false;
		}
	}
	
	

	
}
