package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Java35Iterator {
    public static void main(String[] args){
    ArrayList<Integer> ssss=new ArrayList<>();
    ssss.add(10);
    ssss.add(20);
    ssss.add(30);
        Iterator<Integer> ss=ssss.iterator();
        while (ss.hasNext()){
            System.out.println("gasim");
            ss.next();
        }
}}
