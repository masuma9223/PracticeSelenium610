package com.company;

class Java17Polomorhisim {
    public static void main(String[] args){
        Java18Dog dog=new Java18Dog();
        dog.bark();
        dog.eat();
        dog.sleep();
        dog=new Chow();
        dog=new Java18Dog();
        dog.sleep();

        Chow chow=(Chow)dog;
        chow.special();
        chow.hunt();


    }



}
