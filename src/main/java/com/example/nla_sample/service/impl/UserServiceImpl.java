package com.example.nla_sample.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.nla_sample.model.User;
import com.example.nla_sample.repository.UserRepository;
import com.example.nla_sample.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private JdbcTemplate jtm;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM USERS";
        List<User> users = jtm.query(sql, new BeanPropertyRowMapper(User.class));
        return users;
	}

	@Override
	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(Long id, User user) {
		userRepository.save(user);		
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);	
	}

}
