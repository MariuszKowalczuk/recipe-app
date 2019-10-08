package pl.mk.recipeApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mk.recipeApp.domain.UnitOfMeasure;

/**
 * @author Mariusz Kowalczuk
 */
interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
