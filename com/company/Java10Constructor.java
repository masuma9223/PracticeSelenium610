package com.company;

public class Java10Constructor {
    /*
    one parameters and second wihtout parameters
    create seprate task class

     */
int age;
String name;
char grade;
    Java10Constructor(){
        System.out.println("not arguments");

    }

    Java10Constructor(String valuename, int valueage){
        age=valueage;
        name=valuename;
        System.out.println("argument");
    }
    public static void main(String[] args){
        Java10Constructor con=new Java10Constructor();
        Java10Constructor con2=new Java10Constructor("masuma", 30);

    }


}
