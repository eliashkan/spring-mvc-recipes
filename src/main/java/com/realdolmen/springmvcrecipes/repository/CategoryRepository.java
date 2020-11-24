package com.realdolmen.springmvcrecipes.repository;

import com.realdolmen.springmvcrecipes.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
