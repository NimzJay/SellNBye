package com.boot.Nimz.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.Nimz.Model.UserDTO;
import com.boot.Nimz.Repositories.UserRepository;
import com.boot.Nimz.Services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<UserDTO> findAllUsers() {

		List<UserDTO> allUsers = userRepo.findAll();
		return allUsers;
	}

	@Override
	public String saveUser(UserDTO userdata) {
		userRepo.save(userdata);

		return "Successfully Saved.";
	}

	@Override
	public String updateUser(UserDTO newuserdata) {

		String msg = null;
		if (newuserdata.getId() != null) {
			userRepo.save(newuserdata);
			msg = "Successfully Updated.";
		} else {
			msg = "Update Error";
		}

		return msg;
	}

	@Override
	public Optional<UserDTO> findById(Integer id) {

		Optional<UserDTO> sortUsers = userRepo.findById(id);
		return sortUsers;
	}

	@Override
	public String dltById(Integer id) {

		String msg = null;
		if (id != null) {
			userRepo.deleteById(id);
			msg = "Successfully Deleted.";
		} else {
			msg = "Deletion Error";
		}
		return msg;
	}

}
