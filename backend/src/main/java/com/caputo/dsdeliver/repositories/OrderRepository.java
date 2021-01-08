package com.caputo.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caputo.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
