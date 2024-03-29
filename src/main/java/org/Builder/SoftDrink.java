package org.Builder;

public abstract class SoftDrink implements Item{


    String drink;
    Double drinkCost;

    public SoftDrink(String name, Double price){
        this.drink=name;
        this.drinkCost=price;
    }
@Override
public String name(){
        return drink;
}

@Override
public double price(){
        return drinkCost;
}

    @Override
    public String toString() {
        return "drink_name= " + drink + ", price=" + drinkCost;
    }

    @Override
    public Packing packing() {
        return new FountainBottle("bottle");
    }
}
