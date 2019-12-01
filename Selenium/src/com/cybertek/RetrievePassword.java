package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("ramis_md@mail.ru");
        driver.findElement(By.id("form_submit")).click();
        if(driver.getCurrentUrl().contains("email_sent")){
            System.out.println("EMAIL SENT");
        }else{
            System.out.println("NOT SENT");
        }

    }
}
