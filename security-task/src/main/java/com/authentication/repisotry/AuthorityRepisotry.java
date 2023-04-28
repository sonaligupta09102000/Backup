package com.authentication.repisotry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authentication.entity.Authority;

public interface AuthorityRepisotry extends JpaRepository<Authority, Integer> {

}
