package com.company;

public class Java20KeyworkdFinal {
}
class Computer extends Java20KeyworkdFinal{
    String brand;
    Computer(String brand){
        this.brand=brand;
    }
    public void run(){
        System.out.println("run");
    }
    public void transfer(){
        System.out.println("transfer");
    }
    public void storage(){
        System.out.println("storge");
    }}
    class Apple extends Computer{
    Apple(String brand){
        super(brand);
    }
    @Override
        public void run(){
        System.out.println("my run override");
    }
    public void storage(){
        System.out.println("override storage");
    }
    }
