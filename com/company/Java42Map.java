package com.company;

import java.util.*;

public class Java42Map {
    public static void main(String[] args) {
        Map<String,Integer> hasMap=new HashMap<>();
        hasMap.put("jak", 1);
        hasMap.put("masu", 2);
        hasMap.put("sabeen", 3);
        hasMap.put("cristina", 4);

//        Set<String> set=new HashSet<>();
//        Iterator<String> set2=set.iterator();

        Set<Map.Entry<String,Integer>> set1=hasMap.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=set1.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> element=iterator.next();
            System.out.print(element.getKey());
            System.out.print(element.getValue());
        }

    }

}
