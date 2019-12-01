package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenuim {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://liverpool-fan.ru");

       // Thread.sleep(2000);
        //driver.navigate().back();
        System.out.println(driver.getTitle());

    }
}
