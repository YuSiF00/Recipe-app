package yusif.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import yusif.springframework.recipeapp.model.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
