package com.company;

public class Java14Subclass extends Java13Inheritance{
    String userAddress;
    Java14Subclass(String name, String number){
        super(name, number);
        this.userAddress=userAddress;
    }
    void userDetils(){
        System.out.println(super.name);
    }
    public static void main(String[] args){
        Java14Subclass userinfo=new Java14Subclass("liya", "12233434343");
        userinfo.userDetils();
    }


    }


