package pl.mk.recipeApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mk.recipeApp.domain.Recipe;

/**
 * @author Mariusz Kowalczuk
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
