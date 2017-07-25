package com.conneqtor.web;

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
@RequestMapping("/createNewUser")
public class CreateNewUserRestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Boolean createNewUser_JSON(@RequestBody String newUserJson, HttpSession session, ModelMap modelMap){
		System.out.println("rest controller hit");
		System.out.println(newUserJson);

		Gson gson = new Gson();
		User newUser = gson.fromJson(newUserJson, User.class);
		boolean result = userService.updateUser(newUser);
		
		return true;
	}

}
