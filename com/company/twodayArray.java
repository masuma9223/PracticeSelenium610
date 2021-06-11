package com.company;

public class twodayArray {
    public static void main(String[] args){
    int [][] numbers={
            {10,11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
    };
    for (int row=0; row<numbers.length; row++){
        for (int col=0; col<numbers[row].length; col++){
            System.out.println(numbers[row][col]+" ");
        }

    }
}}
