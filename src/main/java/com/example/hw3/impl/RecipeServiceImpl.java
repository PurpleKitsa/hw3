package com.example.hw3.impl;

import model.Recipe;
import service.RecipeService;

import java.util.HashMap;
import java.util.Map;

public abstract class RecipeServiceImpl implements RecipeService {
    public final Map<Integer, Recipe> listRecipe = new HashMap<>();
    private int counter = 0;

    @Override
    public void addRecipe(Recipe recipe) {
        counter++;
        listRecipe.put(counter, recipe);
    }

    @Override
    public Recipe showRecipe(int id) {
        Recipe recipe = listRecipe.get(id);
        if (recipe != null) {
            return recipe;
        }
        return null;
    }

    @Override
    public Map<Integer, Recipe> listRecipe() {
        return listRecipe;
    }

    @Override
    public boolean deleteRecipe(int id) {
        if (listRecipe.containsKey(id)) {
            listRecipe.remove(id);
            return true;
        }
        return false;
    }
}

