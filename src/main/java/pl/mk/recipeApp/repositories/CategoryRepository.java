package pl.mk.recipeApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mk.recipeApp.domain.Category;

/**
 * @author Mariusz Kowalczuk
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
