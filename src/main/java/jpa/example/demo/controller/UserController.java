package jpa.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jpa.example.demo.entity.User;
import jpa.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/user/info")
	public String getUsers() {
		return "Mediante este endPoint se obtiene información de los user.";
	}
	
	@GetMapping(path = "/list-user", produces = "application/json")
	public List<User> getListuser(){
		return userService.getListUser();
	}
	
}
