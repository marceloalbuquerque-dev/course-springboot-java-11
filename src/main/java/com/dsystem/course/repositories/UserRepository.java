package com.dsystem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsystem.course.entities.User;

public interface UserRepository extends  JpaRepository<User, Long>{
	

}
