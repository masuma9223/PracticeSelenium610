package com.company;

abstract public class Java40Practice {
    String type;
    String color;
    Java40Practice(String type, String color){
        this.type=type;
        this.color=color;
    }
    public abstract  void bloom();
}
class Rose extends Java40Practice{
    Rose(String type, String color){
        super(type,color);
    }
    public void bloom(){
        System.out.println(type+"overriding");
    }
}
