package com.company;

public class Java16Task {
    /*
    create class with static method has 3 overloadid forms.
    then call each overloaded method with specific arguments and observe result.
     */

    static void  masuma(){
        System.out.println("nothing");
    }
    static void masuma(String name){
        System.out.println("reall name"+name);
    }
    static void masuma(int age){
        System.out.println("your age"+ age);
    }
    public static void main(String[] args){
        Java16Task ss=new Java16Task();
        ss.masuma();
        ss.masuma("masuma");
        ss.masuma(12);
    }

}
