package com.example.hw3.impl;

import model.Ingredient;
import service.IngredientService;

import java.util.HashMap;
import java.util.Map;

public abstract class IngredientServiceImpl implements IngredientService {
    public final Map<Integer, Ingredient> listIngredients = new HashMap<>();
    private static int counter = 0;

    @Override
    public int addIngredient(Ingredient ingredient) {
        counter++;
        listIngredients.put(counter, ingredient);

        return 0;
    }

    @Override
    public Ingredient showIngredient(int id) {
        Ingredient ingredient = listIngredients.get(id);
        if (ingredient != null) {
            return ingredient;
        }
        return null;
    }

    @Override
    public Map<Integer, Ingredient> listIngredient() {
        return listIngredients;

    }

    @Override
    public Ingredient editIngredient(int id, Ingredient ingredient) {
        if (listIngredients.containsKey(id)) {
            listIngredients.put(id, ingredient);
            return ingredient;
        }
        return null;
    }

    @Override
    public boolean deleteIngredient(int id) {
        if (listIngredients.containsKey(id)) {
            listIngredients.remove(id);
            return true;
        }
        return false;
    }
}


