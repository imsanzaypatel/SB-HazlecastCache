package com.hazlecastcache.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hazlecastcache.entity.User;
import com.hazlecastcache.service.UserService;

@RestController
@RequestMapping("/cache-api")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return service.getUsers();
	}

	@GetMapping("/getUserById/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return service.getUser(id);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.delete(id);
	}

}