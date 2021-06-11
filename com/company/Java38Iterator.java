package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Java38Iterator {
    public static void main(String[] args){
    ArrayList<String> ssss=new ArrayList<>();
    ssss.add("kabul");
    ssss.add("New York");
    ssss.add("Las Vegas");
    ssss.add("San Diegoa");
        System.out.println(ssss);
        Iterator<String> iterator=ssss.iterator();
        while (iterator.hasNext()){
            if(iterator.next().endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(ssss);
        //System.out.println(iterator.hasNext());
       // System.out.println(iterator.next());
}}
