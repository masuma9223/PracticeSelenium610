package com.company;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Java51ExcellPractice {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\12028\\Desktop\\JavaWithMosh\\src\\com\\company\\hrmsData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);// create connection
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);// creating object fo xssfworkbook to mainpulate xlsx files
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        List<Java54GetterSetter> java54GetterSetterList=new ArrayList<>();

        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row = sheet.getRow(i);
            Java54GetterSetter java54GetterSetter=new Java54GetterSetter();// constractur object
            java54GetterSetter.setFirstname(row.getCell(0).toString());
            java54GetterSetter.setLastname(row.getCell(1).toString());
            java54GetterSetter.setAge((int) row.getCell(2).getNumericCellValue());

            java54GetterSetterList.add(java54GetterSetter);
        }
        System.out.println(java54GetterSetterList);

    }
}
