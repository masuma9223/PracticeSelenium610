package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Java47MapEntry {
    public static void main(String[] args) {
    HashMap<String,Integer> BestByStore= new HashMap<>();
        BestByStore.put("Printer", 10);
        BestByStore.put("Mouse", 20);
        BestByStore.put("wire", 30);
        BestByStore.put("labtop", 40);


        Iterator<Map.Entry<String, Integer>> iterator=BestByStore.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> next= iterator.next();
            System.out.println(next);
        }
}}
