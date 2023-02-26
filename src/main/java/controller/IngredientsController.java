package controller;

import model.Ingredient;
import model.Recipe;
import org.springframework.web.bind.annotation.*;
import service.IngredientService;

@RestController
@RequestMapping("/ingredient")
public class IngredientsController {
    private final IngredientService ingredientService;

    public IngredientsController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public void addIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.addIngredient(ingredient);
    }

    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable int id) {
        return ingredientService.showIngredient(id);
    }
}
