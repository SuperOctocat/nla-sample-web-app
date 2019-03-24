package com.example.nla_sample.service;

import java.util.List;
import java.util.Optional;

import com.example.nla_sample.model.User;

public interface UserService {
	
	List<User> getAllUsers();
	
	Optional<User> getUser(Long id);
	
	void addUser(User user);
	
	void updateUser(Long id, User user);
	
	void deleteUser(Long id);
}

