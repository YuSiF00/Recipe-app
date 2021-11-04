package yusif.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import yusif.springframework.recipeapp.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
