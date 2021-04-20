package com.uv.rooms.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uv.rooms.model.User;
import com.uv.rooms.repository.UserJpaRepository;
import com.uv.rooms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserJpaRepository repository;

	@Override
	public User findById(Long idUser) {
		Optional<User> optional = repository.findById(idUser);
		if(optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}


}