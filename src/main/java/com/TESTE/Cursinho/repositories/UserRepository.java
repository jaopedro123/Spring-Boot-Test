package com.TESTE.Cursinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TESTE.Cursinho.entities.User;

public interface UserRepository extends JpaRepository<User,Long	>{
	
	

}
