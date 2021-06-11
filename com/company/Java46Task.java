package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Java46Task {
    public static void main(String[] args) {
        HashMap<String,Integer> BestByStore= new HashMap<>();
        BestByStore.put("Printer", 10);
        BestByStore.put("Mouse", 20);
        BestByStore.put("wire", 30);
        BestByStore.put("labtop", 40);
        Set<String> ss=BestByStore.keySet();
        Iterator<String> iterator=ss.iterator();
        while (iterator.hasNext()){
            String key= iterator.next();
            System.out.println(key +" "+ BestByStore.get(key));
        }



    }
}
