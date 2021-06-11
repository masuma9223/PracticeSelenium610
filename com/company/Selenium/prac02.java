package com.company.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\12028\\Desktop\\SeleniumPractice\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String url=driver.getTitle();
        System.out.println(url);
        //driver.close();
        driver.findElement(By.id("email")).sendKeys("SyntaxTech");
    }
}
