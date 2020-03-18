package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.domain.Users;

@Repository
public interface UsersMapper {
	
	
	List<Users> selectUsers();
	
    int deleteByPrimaryKey(Integer sid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

	List<Users> search(String keyword);
}