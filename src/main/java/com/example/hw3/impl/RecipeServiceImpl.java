package com.example.hw3.impl;

import model.Recipe;
import service.RecipeService;

import java.util.HashMap;
import java.util.Map;

public class RecipeServiceImpl implements RecipeService {
        public final Map<Integer, Recipe> listRecipe = new HashMap<>();
    private int counter = 0;

    @Override
    public void addRecipe(Recipe recipe) {
        counter++;
        listRecipe.put(counter, recipe);
    }

    @Override
    public Recipe showRecipe(int number) {
        return listRecipe.get(number);
    }
}
