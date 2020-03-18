package com.ssm.dao;

import com.ssm.domain.Student;

public interface StudentMapper {
	
	String selectPasswordByName(String username);
	
    int deleteByPrimaryKey(Integer uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}