package com.company;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Java53Array {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\12028\\Desktop\\JavaWithMosh\\src\\com\\company\\hrmsData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell);
//            String firstname = cell.getStringCellValue();
//            String lastname = row.getCell(1).getStringCellValue();
//            int age = (int) row.getCell(2).getNumericCellValue();
            }
            System.out.println();
        }
    }
}
