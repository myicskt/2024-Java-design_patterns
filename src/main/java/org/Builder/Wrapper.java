package org.Builder;

public class Wrapper implements Packing{
    String rap;
    public Wrapper(String str){
        this.rap=str;

    }


    @Override
    public String pack() {
        return new String("warp");
    }

    @Override
    public String toString() {
        return "packing='" + rap ;
    }
}
