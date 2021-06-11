package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Java45Map4 {
    public static void main(String[] args) {
        HashMap<String,Double> ss=new HashMap<>();
        ss.put("milke", 1.0);
        ss.put("apple", 2.0);
        ss.put("orange", 3.0);
        ss.put("banana", 4.0);

        HashMap<String,Double> ss2=new HashMap<>();
        ss2.put("watar", 5.0);
        ss2.put("cofee", 6.0);
        ss2.put("beer", 7.0);
        ss2.put("snake", 8.0);

        ss2.putAll(ss);
        Set<String> setone= ss2.keySet();
        Iterator<String> iterator=setone.iterator();
        Double sum=0.0;
//        for (String item:setone
//             ) {
//            sum+=ss2.get(item);
//        }


        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.equals("beer")){
                ss2.remove(item);
            }
            if(ss2.get(item)!=null){
                sum+=ss2.get(item);
            }

        }
        System.out.println(sum);

    }}
