package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        System.out.println(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href"));

        if(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href").contains("forgot-password.html")){
            System.out.println("Link verification is PASSED");
            System.out.println("The link does contain the expected value");
        }else{
            System.out.println("Link verification is FAILED");
            System.out.println("The link does NOT contain the expected value");
        }

    }
}
