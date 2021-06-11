package com.company;

public class Java08Task {
    /*
    crate method that will take a string as a parameter and returns reverse string.
    mehtod should be avaliable to all acces within your project and accessible by class name.
     */
    public static String revrsString( String string){
        StringBuilder stringBuilder= new StringBuilder(string);
        return stringBuilder.reverse().toString();

    }
    public static void main(String[] args){
        Java08Task abc= new Java08Task();
        System.out.println(abc);
    }
}
