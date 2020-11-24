package com.realdolmen.springmvcrecipes.repository;

import com.realdolmen.springmvcrecipes.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
