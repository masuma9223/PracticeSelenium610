package com.company;

abstract public class Java21Abstruction {
    String color;
    static int totlaVehicle;
    public void call(){
        totlaVehicle++;
        System.out.println("call");
    }
    public void text(){
        System.out.println("text");
    }
    public abstract void tekePicture();
    public abstract void playMusic();
}
class Iphone extends Java21Abstruction{

    @Override
    public void tekePicture() {
        System.out.println("take pic iphone");

    }

    @Override
    public void playMusic() {
        System.out.println("play music iphone");

    }
}
class Samsung extends Java21Abstruction{

    @Override
    public void tekePicture() {
        System.out.println("take pic sumsung");

    }

    @Override
    public void playMusic() {
        System.out.println("play music sumsung");

    }
    public void Duo(){
        System.out.println("make vido sumsung");
    }
}
