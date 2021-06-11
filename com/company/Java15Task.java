package com.company;

public class Java15Task {
    /*
    created class name programming
    while creating an object of the class,
    if nothing is passed to it , then the massege I love programming languages should be printed.
    if some string passed to it, then in place of "proramming lanuages
    the value variable should be printed.
     */
    String name;
    Java15Task(){
        System.out.println("I love programming language");
    }
    Java15Task(String name){
        System.out.println("Programming languages");
    }

    public static void main(String[] args){
        Java15Task ss=new Java15Task();
        Java15Task sss=new Java15Task("Masuma");

    }
}
