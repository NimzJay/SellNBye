package com.boot.Nimz.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.Nimz.Model.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Integer> {

	// getAllUsers
	// findById
	// delete
	// update
	// custom Query

}
