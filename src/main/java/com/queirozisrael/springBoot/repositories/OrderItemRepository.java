package com.queirozisrael.springBoot.repositories;

import com.queirozisrael.springBoot.entities.OrderItem;
import com.queirozisrael.springBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
