package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Java56TaskException {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\12028\\Desktop\\JavaWithMosh\\src\\com\\company\\configurations.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);

        String browser=(String)properties.get("browser");
        String url=(String)properties.get("url");
        String username=(String)properties.get("username");
        String password=(String)properties.get("password");

        if (browser.contains("Chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.findElement(By.id("email")).sendKeys(username);
            driver.findElement(By.id("pass")).sendKeys(password);
        }else if (browser.contains("firefox")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver drivers=new FirefoxDriver();
            drivers.get(url);
            drivers.findElement(By.id("email")).sendKeys(username);
            drivers.findElement(By.id("pass")).sendKeys(password);

    }else{
            System.out.println("Invalid browser");
        }
}}
