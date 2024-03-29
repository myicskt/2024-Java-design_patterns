package org.Builder;

public abstract class Burgger implements Item {

    private String name;
    private double price;

    public Burgger(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;

    }

    public double price() {
        return price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public Packing packing() {
        return new Wrapper("wrap");
    }

}