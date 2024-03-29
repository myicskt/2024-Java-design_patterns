package org.Builder;

public class VegPattyBurger extends Burgger{


    public VegPattyBurger(){
        this("vage burger ", 1.35);

    }

    public VegPattyBurger (String name , double price){
        super(name, price);
    }

}
