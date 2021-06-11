package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Java37HasNextm {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(23.45);
        arrayList.add(25423.454);
        arrayList.add(52.646);
        Iterator<Double> iterator = arrayList.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
