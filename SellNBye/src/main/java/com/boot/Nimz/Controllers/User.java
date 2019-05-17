package com.boot.Nimz.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.Nimz.Model.UserDTO;
import com.boot.Nimz.Services.UserServices;

@RestController
@RequestMapping("/user")
public class User {

	@Autowired
	private UserServices userservices;

	@GetMapping("/all")
	public List<UserDTO> allUsers() {
		return userservices.findAllUsers();
	}

	@PostMapping("/add")
	public String addUser(@RequestBody UserDTO UserData) {
		return userservices.saveUser(UserData);
	}

	@PutMapping("/update")
	public String updateUser(@RequestBody UserDTO newUserData) {
		return userservices.updateUser(newUserData);
	}

	@GetMapping("find/{id}")
	public Optional<UserDTO> getUserById(@PathVariable Integer id) {
		return userservices.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUserById(@PathVariable Integer id) {
		return userservices.dltById(id);
	}

}
