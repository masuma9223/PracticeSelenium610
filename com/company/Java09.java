package com.company;

public class Java09 {
    private static String vowelsOnly(String name){
        return name.replaceAll("[^ AEIOUaeiou]", "");
    }
    public static void main(String[] args){
        System.out.println(vowelsOnly("all the vowls will be remored") );

    }
}
