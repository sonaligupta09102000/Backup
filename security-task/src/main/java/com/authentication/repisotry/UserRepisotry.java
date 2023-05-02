package com.authentication.repisotry;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.authentication.entity.Users;

@Repository
public interface UserRepisotry extends JpaRepository<Users, Integer>{
	
	//@Query("SELECT u FROM  Users u WHERE u.name=:name")
	Optional<Users> findByname(String name);
	
	
	//public Users getbypassword(String password);

}
