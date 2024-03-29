package org.factory.classwork;

import java.util.*;
import java.util.function.Predicate;

public interface UnaryPredicates<T> {

    public boolean mytest(T t);
}

class Algorithm<T> {


    public  int countIf(Collection<T> c, UnaryPredicates<T> p){
        int count =0;
        for(T ele:c){
            if(p.mytest(ele)){
                count++;
            }
        }
        return count;

    }






}

class MainClass {
    public static void main(String[] args) {
        Algorithm<Integer> alg = new Algorithm<>();

        List<Integer> data = Arrays.asList(23,5, 45, 66, 98, 89);

        UnaryPredicates<Integer> even = (u) -> u % 2 == 0;
        UnaryPredicates<Integer> addNumbers = (u) -> u % 2 != 0;

        System.out.println(alg.countIf(data, addNumbers));
        System.out.println(alg.countIf(data, even));


        List<String> stringData = Arrays.asList("mom","apple","tat");
        UnaryPredicates<String> up = (s) -> new StringBuffer(s).reverse().toString().equals(s);
       // System.out.println(alg.countIf(stringData, up));



    }
}