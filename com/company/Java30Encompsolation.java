package com.company;

public class Java30Encompsolation {
    private String name;
    private String ssn;
    private int age;
    private double taxPaid;

    public Java30Encompsolation(String name, String ssn, int age, double taxPaid) {
        this.name = name;
        this.ssn = ssn;
        this.age = age;
        this.taxPaid = taxPaid;
    }
    public void setTaxPaid(String ssn, double taxPaid){
        if(this.ssn.equals(ssn)){
            if(taxPaid>0) {
                this.taxPaid = taxPaid;
            }else{
                System.out.println("can not be nagative");}
            }else {
            System.out.println("wrong ssn");
            }
        }
        double getTaxPaid(String ssn){
        if(this.ssn.equals(ssn)){
            return taxPaid;
        }else{
            return -1;
        }
    }}

