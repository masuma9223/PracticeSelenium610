package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int age=30;

        byte ageHer=30;
        double ageHis=30.1;
        char abc;
        boolean True;
        Date now = new Date();
        System.out.println(now);
        int x;
        int y;
        Point point1=new Point(x=1, y=1);
        Point point2=point1;
        point1.x=2;
        System.out.println(point2);
        System.out.println("---------------");
        int[] numbers=new int[5];
        numbers[0]=1;
        numbers[1]=2;
        System.out.println(Arrays.toString(numbers));
        int[]number2= new int[]{3, 5, 1, 4, 9};
        Arrays.sort(number2);
        System.out.println("----------------");
        int [][]number3=new int [2][3];
        number3[0][0]=1;
        System.out.println(Arrays.deepToString(number3));
        double result=(double)10/ (double)3;
        System.out.println(result);
        //Implicit casting
        //byte>short>int>long>float>double
        int result2=Math.round(1.1F);
        System.out.println(result);







    }
}
