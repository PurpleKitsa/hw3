package service;
import model.Recipe;

public interface RecipeService {
    void addRecipe(Recipe recipe);
    Recipe showRecipe(int number);
}