package com.company.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /**
     * 1.launch the browser
     * 2.navigate to amzon web site
     * 3.print out the title and the url in the console
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\12028\\Desktop\\SeleniumPractice\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.facebook.com/");
        String url=driver.getTitle();
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(url);
    }
}
