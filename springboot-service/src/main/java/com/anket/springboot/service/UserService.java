package com.anket.springboot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anket.springboot.entity.Users;

public interface UserService extends JpaRepository<Users, Long>{

}
