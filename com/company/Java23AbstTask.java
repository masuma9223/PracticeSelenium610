package com.company;

abstract public class Java23AbstTask {
    public abstract void open();
    public void edit(){
        System.out.println("edit");
    }
    public void close(){
        System.out.println("close");
    }
}
class JavaFile extends Java23AbstTask{
    public void open(){
        System.out.println("open notepad");
    }
}
class WordFile extends Java23AbstTask{

    @Override
    public void open() {
        System.out.println("open Microsoft");

    }
}
class PdfFile extends Java23AbstTask{

    @Override
    public void open() {
        System.out.println("open pdfile");

    }
}
