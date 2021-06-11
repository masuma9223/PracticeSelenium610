package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Java43Map {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("jak", 1);
        hasMap.put("masu", 2);
        hasMap.put("sabeen", 3);
        hasMap.put("cristina", 4);

        Set<String> keyset = hasMap.keySet();
        Iterator<String> iterator=keyset.iterator();
        for (String key : keyset) {
            System.out.println(key);
            System.out.println(hasMap.get(key));
        }


    }
}
