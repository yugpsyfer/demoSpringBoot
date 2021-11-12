package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<user, Long> {
	
	List<user> findByUsername(String Username);
	
}
