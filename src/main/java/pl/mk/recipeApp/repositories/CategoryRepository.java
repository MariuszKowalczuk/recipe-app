package pl.mk.recipeApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mk.recipeApp.domain.Category;

import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
