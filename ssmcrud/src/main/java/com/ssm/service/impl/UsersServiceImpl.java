package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UsersMapper;
import com.ssm.domain.Users;
import com.ssm.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public List<Users> selectUsers() {
		return usersMapper.selectUsers();
	}

	@Override
	public void deleteByPrimaryKey(Integer sid) {
		usersMapper.deleteByPrimaryKey(sid);
	}

	@Override
	public void insert(Users users) {
		usersMapper.insert(users);
	}

	@Override
	public void updateByPrimaryKeySelective(Users users) {
		usersMapper.updateByPrimaryKey(users);
	}

	@Override
	public List<Users> search(String keyword) {
		return usersMapper.search("%"+keyword+"%");
	}

	

	

	
}
