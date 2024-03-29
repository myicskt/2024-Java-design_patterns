package org.Builder;

public class ChickenBurger extends Burgger {

    public  ChickenBurger(){
        this("non-ve Burger", 1.15);
    }
    public ChickenBurger(String name , double price){
        super(name, price);
    }


}
