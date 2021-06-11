package com.company;

public class Java24MainTask {
    public static void main(String[] args) {
//        Java23AbstTask ss= new PdfFile();
//        ss.open();
//        ss.close();
//        ss.edit();
//    }
        Java23AbstTask[] allFile={new PdfFile(), new JavaFile(),new WordFile()};
        for(Java23AbstTask ss: allFile){
            ss.open();
            ss.edit();
            ss.close();
        }
    }
}
