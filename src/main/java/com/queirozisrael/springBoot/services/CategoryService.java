package com.queirozisrael.springBoot.services;

import com.queirozisrael.springBoot.entities.Category;
import com.queirozisrael.springBoot.entities.User;
import com.queirozisrael.springBoot.repositories.CategoryRepository;
import com.queirozisrael.springBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findByID(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
