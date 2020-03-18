package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.StudentMapper;
import com.ssm.dao.UsersMapper;
import com.ssm.service.StudentService;
/*定义组件4中方式：
 *  @Component	可以定义任何类
 *  @Controller	定义Springmvc的controller为组件
 *  @Repository	定义dao为组件
 *  @Service	定义Service层为组件
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
