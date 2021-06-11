package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Java44Map3 {
    public static void main(String[] args) {
        HashMap<String,Double> ss=new HashMap<>();
        ss.put("milke", 1.0);
        ss.put("apple", 2.0);
        ss.put("orange", 3.0);
        ss.put("banana", 4.0);

        Set<String> sss=ss.keySet();
       Iterator<String> iterator = sss.iterator();

       while (iterator.hasNext()){
           String key=iterator.next();
           System.out.println("key "+key+" "+"value "+ss.get(key));

       }


    }
}
