package com.test.db.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.db.model.User;

public interface userRepo extends JpaRepository<User, Integer>{

	Optional<User> findByUserName(String username);

}
