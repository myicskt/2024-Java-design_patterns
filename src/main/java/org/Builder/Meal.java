package org.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> mealItems = new ArrayList<>();


    void addItems(Item item){
        mealItems.add(item);

    }


    double calculateMealCost(){
        double cost = 0.0;
        for(Item it : mealItems){
            cost=cost+it.price();

        }
        return cost;
    }

    void displayMeal(){

        System.out.println("Item                              price");
        System.out.println("**************************************");
        int c=1;
        for (Item i:mealItems) {

            System.out.println(c + ":  " +i.name()+ " "+i.packing()+"             "+i.price());
            c++;
        }
        System.out.println("**************************************");
        System.out.println("                        Total pay : "+ String.format("%.2f", calculateMealCost()));
        System.out.println("**************************************");

    }
}
