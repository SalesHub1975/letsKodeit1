package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenSpoon {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");
        //driver.findElement(By.name("search_query")).sendKeys("wooden spoon" + Keys.ENTER);
        // or
        driver.findElement(By.id("search-query")).sendKeys("wooden spoon" + Keys.ENTER);
        driver.findElement(By.partialLinkText("Register")).click();

        if(driver.getTitle().contains("wooden spoon")){
            System.out.println("Wooden spoon is found");
        }else{
            System.out.println("Wooden spoon is NOT found");
        }
    }
}
