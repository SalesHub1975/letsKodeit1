package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://google.com");

//        String actualTitle = driver.getTitle();
//        if(actualTitle.equalsIgnoreCase("Google")){
//            System.out.println("Google Title Verification PASSED");
//        }else{
//            System.out.println("Google Title Verification FAILED");
//        }

//        driver.get("https://cybertekschool.com/");
//        if(driver.getCurrentUrl().contains("cybertekschool")){
//            System.out.println("Cybertek URL Verification PASSED");
//        }else{
//            System.out.println("Cybertek URL Verification FAILED");
//        }
//

        driver.get("https://google.com");
        driver.findElement(By.linkText("Gmail")).click();

        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail verification is Passed");
        }else{
            System.out.println("Gmail verification is Failed");
        }






    }
}
