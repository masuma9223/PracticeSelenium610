package com.company.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}
