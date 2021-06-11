package com.company;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java52Excel2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\12028\\Desktop\\JavaWithMosh\\src\\com\\company\\hrmsData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet2");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(2);
        cell.setCellValue("masuma");
        System.out.println(cell);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);//writing the data







    }
}
