package com.conneqtor.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.conneqtor.beans.User;
import com.conneqtor.service.UserService;
import com.google.gson.Gson;


@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method=RequestMethod.POST, value="/createNewUser")
	public @ResponseBody Boolean createNewUser_JSON(@RequestBody String newUserJson, HttpSession session, ModelMap modelMap){
		System.out.println("POST rest controller hit");
		System.out.println(newUserJson);

		Gson gson = new Gson();
		User newUser = gson.fromJson(newUserJson, User.class);
		boolean result = userService.updateUser(newUser);
		
		return true;
	}
	@RequestMapping(method=RequestMethod.GET, value="/getAllUsers")
	public @ResponseBody List<User> getAllUsers_JSON(){
		System.out.println("GET rest controller hit");

		List<User> users = userService.getAllUsers();
		
		return users;
	}

}
