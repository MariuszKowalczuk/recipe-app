package pl.mk.recipeApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mk.recipeApp.service.RecipeService;

/**
 * @author Mariusz Kowalczuk
 */
@Controller
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;

    @RequestMapping("recipes")
    public String showRecipes(Model model) {

        model.addAttribute("recipes", recipeService.findAllRecipes());
        return "recipes/recipes";
    }

}
