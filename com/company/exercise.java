package com.company;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
           System.out.println("write number");
           if(number % 5==0) {
               System.out.println("Fizz");
           }else if (number % 10==0){
               System.out.println("Fizz");
           }else if (number % 3==0){
               System.out.println("Buzz");
           }else if (number% 15==0){
               System.out.println("Fizz Buzz");
           }else if(number % 2==0){
               System.out.println("2");
           }else {
               System.out.println("wrong");
           }
    }}