package com.company;

public class Java04StaticVariable {
    /*
    create class called Employee.
    create 3 variables empID,salary and set the ceo to sumair
    create 2 objects of the class employee
    set the value of eID salary for each of the objects
    print out the eID salary and CEO for each of the objects
     */
    public static void main(String[] args){
        Java05Employee emp=new Java05Employee();
        emp.empID=12;
        emp.salary=80-000;
        Java05Employee.CEO="Sumair";

        Java05Employee emp2= new Java05Employee();
        emp2.empID=13;
        emp2.salary=70-000;
        //Java05Employee.CEO="Sumair";
        System.out.println(emp2.CEO);
    }

}
