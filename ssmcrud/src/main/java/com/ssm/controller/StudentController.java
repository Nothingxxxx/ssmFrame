package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssm.service.StudentService;

@SessionAttributes("username")
@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("login")
	public String userLogin(String username, String password, ModelMap map) {
		if (studentService.studentLogin(username, password)) {
			map.addAttribute("name", username);
			System.out.println(username);
			return "showusers.html";
		} else {
			return "login.jsp";
		}

	}

}
