package com.company;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args){
        int i;
        for(i=0; i<5; i++){
        System.out.println("hello world");
            System.out.println("------------");
            //we dont know how many times we do execute
            //while do the conditon frist
            // but while loop at least we have one time execute
            Scanner scan=new Scanner(System.in);
            String input="";
            while (!input.equals("quit")){// we can use true like while(true) and make sure break statment
                System.out.println("Enter input");
               input =scan.next().toLowerCase();
               if(input.equals("pass"))
                   continue;
               if(input.equals("quit"))
                   break;
                System.out.println(input);
            }
            do {
                System.out.println("Enter input");
                input = scan.next().toLowerCase();
                System.out.println(input);
            }while (!input.equals("quit")) ;
            }}}