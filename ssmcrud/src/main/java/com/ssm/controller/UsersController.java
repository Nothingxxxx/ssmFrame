package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.domain.Users;
import com.ssm.service.UsersService;
import com.ssm.util.PageUtil;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@RequestMapping("showusers")
	@ResponseBody
	public PageInfo<Users> getUsers(Integer page){
		//startPage(currentPage,pageSize)
		PageHelper.startPage(page,PageUtil.PAGESIZE);
		List<Users> list = usersService.selectUsers();
		System.out.println(list);
		PageInfo<Users> pageInfo = new PageInfo<>(list,PageUtil.NAVIGATEPAGE);
		return pageInfo;
	}
	
	@RequestMapping("delete")
	public String deleteUsersById(Integer sid,Integer page) {
		usersService.deleteByPrimaryKey(sid); 
		
		//删除数据后，返回getUsers方法，重新查询数据
		return "showusers.do?page="+page;
	}
	
	@RequestMapping("insert")
	public String insertUsers(Users users) {
		usersService.insert(users);
		return "showusers.do?page="+1;
	}
	
	@RequestMapping("update")
	public String updateUsers(Users users) {
		usersService.updateByPrimaryKeySelective(users);
		return "showusers.do?page="+1;
	}
	
	@RequestMapping("search")
	@ResponseBody
	public PageInfo<Users> searchUsers(String keyword,Integer page) {
		//startPage(currentPage,pageSize)
		PageHelper.startPage(page,PageUtil.PAGESIZE);
		List<Users> list = usersService.search(keyword);
		System.out.println(list);
		PageInfo<Users> pageInfo = new PageInfo<>(list,PageUtil.NAVIGATEPAGE);
		return pageInfo;
	}
}
