package org.Builder;

public class FastFoodMeals {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal meal = builder.prepareNonVegMeals();

        meal.displayMeal();
    }
}
