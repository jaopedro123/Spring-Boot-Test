package com.TESTE.Cursinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TESTE.Cursinho.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
	

}
