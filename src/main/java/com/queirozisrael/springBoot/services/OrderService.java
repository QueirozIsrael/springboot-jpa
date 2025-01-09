package com.queirozisrael.springBoot.services;

import com.queirozisrael.springBoot.entities.Order;
import com.queirozisrael.springBoot.entities.User;
import com.queirozisrael.springBoot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public User findByID(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get().getClient();
    }
}
