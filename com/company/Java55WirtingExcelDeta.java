package com.company;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java55WirtingExcelDeta {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\12028\\Desktop\\JavaWithMosh\\src\\com\\company\\hrmsData.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        XSSFSheet Sheet3= xssfWorkbook.createSheet("Sheet3");
        XSSFRow row = Sheet3.createRow(0);
        XSSFCell cell=row.createCell(0);
        cell.setCellValue("Test");
        xssfWorkbook.write(fileOutputStream);




    }
}
