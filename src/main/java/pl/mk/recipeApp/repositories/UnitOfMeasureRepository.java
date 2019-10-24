package pl.mk.recipeApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mk.recipeApp.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * @author Mariusz Kowalczuk
 */
public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
