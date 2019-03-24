/**
 * 
 */
package com.example.nla_sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.nla_sample.model.User;
import com.example.nla_sample.service.impl.UserServiceImpl;


@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userService; 
	
	@RequestMapping("/users")
	public ModelAndView getAllUsers() {
		List<User> users = userService.getAllUsers();
        Map<String, Object> params = new HashMap<>();
        params.put("users", users);
        return new ModelAndView("users", params);
	}
	
	@RequestMapping("/users/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody User user, @PathVariable Long id) {
		userService.updateUser(id, user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
	}
	
	 @RequestMapping("/showUsers")
	    public ModelAndView showUsers() {
	        List<User> users = userService.getAllUsers();
	        Map<String, Object> params = new HashMap<>();
	        params.put("users", users);
	        return new ModelAndView("showUsers", params);
	    }
}
