package com.queirozisrael.springBoot.repositories;

import com.queirozisrael.springBoot.entities.Category;
import com.queirozisrael.springBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
