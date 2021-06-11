package com.company;

public class forEachLoop {
    public static void main(String[] args){
        // we use this one for collection or array
        String[] fruits={"apple","mango","orange"};
        for (int i=0; i<fruits.length; i++)
            System.out.println(fruits[i]);
        System.out.println("----------");
        for(String fru : fruits)
            System.out.println(fru);
    }
}
