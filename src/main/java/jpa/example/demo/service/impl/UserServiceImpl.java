package jpa.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.example.demo.entity.User;
import jpa.example.demo.repository.UserRepository;
import jpa.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getListUser() {
		List<User> lstUser = userRepository.findAll();
		return userRepository.findAll();
	}

	@Override
	public User getUser(Long idUser) {
		return userRepository.getById(idUser);
	}

}
