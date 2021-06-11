package com.company.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\12028\\Desktop\\JavaWithMosh\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String url=driver.getTitle();
        System.out.println(url);
        driver.close();
    }
}
