package com.company;

public class Java22PhoneTester {
   public static void main(String[] args){
       //Java21Abstruction ss= new Iphone();
       //ss=new Samsung();
       Java21Abstruction[] allphone={new Iphone(), new Samsung()};
               for (Java21Abstruction ss : allphone){
                   ss.call();
                   ss.text();
                   ss.playMusic();
                   ss.tekePicture();
               }


   }
}
