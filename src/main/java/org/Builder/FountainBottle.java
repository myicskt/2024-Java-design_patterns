package org.Builder;

public class FountainBottle implements Packing{


    String packing;


    FountainBottle ( String packing){
        this.packing=packing;

    }


    @Override
    public String pack() {
        return "Fountain";
    }

    @Override
    public String toString() {
        return "packing='" + packing;
    }
}
