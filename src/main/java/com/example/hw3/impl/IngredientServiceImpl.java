package com.example.hw3.impl;

import model.Ingredient;
import service.IngredientService;

import java.util.HashMap;
import java.util.Map;

public class IngredientServiceImpl implements IngredientService {
    public final Map<Integer, Ingredient> listIngredients = new HashMap<>();
    private static int counter = 0;
    @Override
    public void addIngredient(Ingredient ingredient) {
        counter++;
        listIngredients.put(counter, ingredient);

    }

    @Override
    public Ingredient showIngredient(int number) {
        return listIngredients.get(number);
    }
}


