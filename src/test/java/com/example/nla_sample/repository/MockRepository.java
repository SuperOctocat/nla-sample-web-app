package com.example.nla_sample.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.nla_sample.model.User;

public interface MockRepository extends CrudRepository<User, Long> {

}
