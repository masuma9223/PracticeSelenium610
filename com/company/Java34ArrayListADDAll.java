package com.company;

import java.util.ArrayList;

public class Java34ArrayListADDAll {
    public static void main(String[] args){
        ArrayList<String> ss= new ArrayList<>();
        ss.add("masuma");
        ss.add("seta");
        ss.add("negin");
        //System.out.println(ss);


        ArrayList<String> sss=new ArrayList<>();
        sss.add("kdfds");
        sss.add("kdfldsf");
        sss.add("lkdfjdsl");
        sss.addAll(ss);
        System.out.println(sss);
        for (String names:sss){
            System.out.println(names);
        }


    }
}
