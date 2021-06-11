package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Java36HasNext {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(33.22);
        doubleArrayList.add(344.55);
        System.out.println(doubleArrayList);
        //System.out.println(element);
        //int element = 0;
        doubleArrayList.removeIf(element -> element < 20);
        System.out.println(doubleArrayList);

        Iterator<Double> iterator=doubleArrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next()<20)
                iterator.remove();
            System.out.println(iterator.next());
        }



    }
}