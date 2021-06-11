package com.company;

import java.util.Scanner;

public class exerciseForLoop {
    public static void main(String[] args){
        final byte MonthYear=12;
        final byte Percent=100;

        Scanner scan=new Scanner(System.in);


        while (true){
            System.out.println("Enter number between 1-000 and 1-000-000");
            int input=scan.nextInt();
            if(input>=1000 && input <=1-000-000)
                break;
            System.out.println("enter again");
        }


    }
}
