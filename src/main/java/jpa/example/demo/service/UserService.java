package jpa.example.demo.service;

import java.util.List;

import jpa.example.demo.entity.User;

public interface UserService {
	/**
	 * Obtiene lista de users
	 * @return
	 * 		List<User>
	 */
	List<User> getListUser();
	
	/**
	 * Obtiene información de un user.
	 * @return
	 * 		User
	 */
	User getUser(Long idUser);
}
