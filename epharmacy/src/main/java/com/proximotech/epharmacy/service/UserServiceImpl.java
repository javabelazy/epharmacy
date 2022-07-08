/**
 * 
 */
package com.proximotech.epharmacy.service;

import org.springframework.stereotype.Service;

import com.proximotech.epharmacy.dto.User;

/**
 * @author apple
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public User registerUser(User user) {
		return user;
	}

	public User updateUser(User user) {
		return user;
	}

	public User deactivateUser(User user) {
		return user;
	}

	public User getUserInfo(User user) {
		return user;
	}

}
