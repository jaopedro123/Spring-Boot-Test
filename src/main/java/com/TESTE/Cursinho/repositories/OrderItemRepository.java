package com.TESTE.Cursinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TESTE.Cursinho.entities.OrderItem;
import com.TESTE.Cursinho.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
