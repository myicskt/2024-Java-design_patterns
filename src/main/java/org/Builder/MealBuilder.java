package org.Builder;

public class MealBuilder {

    public Meal prepareVegMeals(){
        Meal m = new Meal();
        m.addItems(new VegPattyBurger());
        m.addItems(new Sprit());
        m.addItems(new Cocacola());

        return m;
    }

    public Meal prepareNonVegMeals(){
        Meal m = new Meal();
        m.addItems(new ChickenBurger());
        m.addItems(new Sprit());
        m.addItems(new Cocacola());


        return m;
    }
}
