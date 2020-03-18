package com.ssm.service;

import java.util.List;

import com.ssm.domain.Users;

public interface UsersService {

	List<Users> selectUsers();
	
	void deleteByPrimaryKey(Integer sid);
	
	void insert(Users users);
	
	void updateByPrimaryKeySelective(Users users);
	
	List<Users> search(String keyword);
}
