package org.factory.classwork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDouplicate {


    public static void main(String[] args) {
        List<String > data = Arrays.asList("mark","mark","jack");

        List<String> afterDoub = (List<String>) data.stream().distinct().collect(Collectors.toList());

        for(String s : afterDoub){
            System.out.println(s);
        }
    }
}
