package com.example.nla_sample.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.nla_sample.model.User;
import com.example.nla_sample.repository.MockRepository;

public class UserServiceImplTest {
	private MockRepository mockRepository;

	@Test
	public List<User> shouldReturnAllUsers() {
		List<User> users = new ArrayList<>();
		mockRepository.findAll()
		.forEach(users::add);
        return users;
	}
}
