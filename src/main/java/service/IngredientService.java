package service;

import model.Ingredient;

import java.util.Map;

public interface IngredientService {
    int addIngredient(Ingredient ingredient);

    Ingredient showIngredient(int number);

    Map<Integer, Ingredient> listIngredient();

    Ingredient editIngredient(int id, Ingredient ingredient);

    boolean deleteIngredient(int id);
}
