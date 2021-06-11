package com.company;

public class Java07TaskModifirers {
    double sumaArray(double [] array){
        double sum=0;
        for (int i=0; i<array.length; i++){
            sum+= array[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Java07TaskModifirers arry=new Java07TaskModifirers();
        double [] arr={10.2, 25, 45};
        System.out.println(arry.sumaArray(arr));
    }
}
