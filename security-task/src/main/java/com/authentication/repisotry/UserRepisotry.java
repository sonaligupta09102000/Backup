package com.authentication.repisotry;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.authentication.entity.Users;

public interface UserRepisotry extends JpaRepository<Users, Integer>{
	
	@Query("SELECT u FROM  Users u WHERE u.name=:name")
	public Users getbyusername(@Param("name") String name);

}
