package com.company;

public class Java18Dog {
    void bark(){
        System.out.println("bark");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void eat(){
        System.out.println("eat");}}


        class Chow extends Java18Dog{
    void sleep(){
        System.out.println("chew sleep");
    }
            void eat(){
                System.out.println("chew eat");}
                void bark(){
                System.out.println("chew bark");}
    void special(){
        System.out.println("special chow");
    }
    void hunt(){
        System.out.println("chew hunt");
    }

        }

