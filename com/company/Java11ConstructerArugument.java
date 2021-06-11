package com.company;

public class Java11ConstructerArugument {
    String name;
    double obj1;
    double obj2;
    double obj3;
    Java11ConstructerArugument(String valuename, double valobj1,double valobj2, double valobj3){
        obj1=valobj1;
        obj2=valobj2;
        obj3=valobj3;

    }
    void printGradeAvergage(){
        double avg=(obj1+obj2+obj3)/3;
        System.out.println("avarge"+ name+"  " +avg);
    }
    public static void main(String[]args){
        Java11ConstructerArugument ss=new Java11ConstructerArugument("masuma",97,33,34);
        ss.printGradeAvergage();
        Java11ConstructerArugument ss2=new Java11ConstructerArugument("seta",89,88,66);
        ss2.printGradeAvergage();

    }
}
