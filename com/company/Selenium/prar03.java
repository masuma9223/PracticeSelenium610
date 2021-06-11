package com.company.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prar03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        WebElement dropDown=driver.findElement(By.cssSelector("select#month"));
        Select obj=new Select(dropDown);
        obj.selectByIndex(1);
        obj.selectByValue("3");
        obj.deselectByVisibleText("Aug");
        // List<WebElement> values=obj.getoptions();
        // int totalValues=values.size();
        //System.out.println(totalValues);
        driver.quit();

        // Alert
        Alert confirmationAlert=driver.switchTo().alert();
        String alertText=confirmationAlert.getText();
        System.out.println("Alert text is"+ alertText);
        // Send some text to the alert
        confirmationAlert.sendKeys("Accepting the alert");
        confirmationAlert.dismiss();

    }
}
