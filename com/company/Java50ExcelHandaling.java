package com.company;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Java50ExcelHandaling {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\12028\\Desktop\\JavaWithMosh\\src\\com\\company\\hrmsData.xlsx";
        //System.out.println(path); when we want undrstand path is working or not we print the path
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("Sheet1");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell.toString());




    }
}
