package pl.mk.recipeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mariusz Kowalczuk
 */
@Controller
@RequestMapping({"", "/", "index"})
public class IndexController {
    public String getIndexPage() {

        System.out.println("Some message ... BLA");
        return "index";
    }
}
