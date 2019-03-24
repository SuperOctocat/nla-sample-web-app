package com.example.nla_sample.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.nla_sample.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
