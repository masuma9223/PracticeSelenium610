package com.company;

import java.util.ArrayList;

public class Java41Test {
    public static void main(String[] args) {
        ArrayList<Java40Practice> javapract= new ArrayList<>();
        javapract.add(new Rose("sunflower", "yellow"));

        for(Java40Practice ff:javapract){
            System.out.println("Name"+ff.type+"color"+ff.color);
        }

    }
}
