package com.TESTE.Cursinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TESTE.Cursinho.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
