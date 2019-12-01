package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {

    public static void main(String[] args)throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple"); // or +Keys.ENTER
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        if(driver.getTitle().startsWith("apple")){
            System.out.println("PASSSSSSS");
        }else{
            System.out.println("FAIL");
        }


    }
}
