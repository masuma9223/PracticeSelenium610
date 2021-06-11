package com.company;

public class Java12Constractor {
    int age;
    static String name;
    double salary;
     Java12Constractor(String name){
        this.name=name;
        System.out.println();
    }
    Java12Constractor(int age){
        this.age=age;
    }
    public Java12Constractor(double salary){
        this.salary=salary;
    }
    public static void main(String[] args){
        Java12Constractor ss=new Java12Constractor("masuma");
        System.out.println(Java12Constractor.name);
    }
}
