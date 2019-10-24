package pl.mk.recipeApp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mk.recipeApp.domain.Recipe;
import pl.mk.recipeApp.repositories.RecipeRepository;

import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public List<Recipe> findAllRecipes() {
        return recipeRepository.findAll();
    }

}
