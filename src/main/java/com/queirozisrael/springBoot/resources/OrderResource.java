package com.queirozisrael.springBoot.resources;

import com.queirozisrael.springBoot.entities.Order;
import com.queirozisrael.springBoot.entities.User;
import com.queirozisrael.springBoot.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> finById(@PathVariable Long id) {
        User obj = service.findByID(id);
        return ResponseEntity.ok().body(obj);
    }

}
