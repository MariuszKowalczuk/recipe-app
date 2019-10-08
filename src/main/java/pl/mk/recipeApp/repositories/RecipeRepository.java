package pl.mk.recipeApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mk.recipeApp.domain.Recipe;

/**
 * @author Mariusz Kowalczuk
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
