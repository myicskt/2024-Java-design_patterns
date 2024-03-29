package org.Builder;

public class Cocacola extends SoftDrink{


    public Cocacola(){
        this("cocacola", 1.2);
    }
    public Cocacola(String name, Double price) {
        super(name, price);
    }
}
