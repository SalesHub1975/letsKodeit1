package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkboxes {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");


        // locating checkbox1
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        //--> another way of locating the same webElement --> (//input[@type='checkbox'])[1]

        // locating checkbox2
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        //--> (//input[@type='checkbox'])[2]

        //#1
        if(!checkbox1.isSelected()){
            System.out.println("CheckBox #1 is not Selected. Verification PASSED");
        }else{
            System.out.println("Checkbox #2 is Selected. Verification FAILED");
        }

        if(checkbox2.isSelected()){
            System.out.println("CheckBox #2 is Selected. Verification PASSED");
        }else{
            System.out.println("CheckBox#2 is NOT Selected. Verification FAILED");
        }

        checkbox1.click();
        checkbox2.click();


        if(checkbox1.isSelected()){
            System.out.println("CheckBox #1 is Selected. Verification PASSED");
        }else{
            System.out.println("Checkbox #2 is NOT Selected. Verification FAILED");
        }

        if(!checkbox2.isSelected()){
            System.out.println("CheckBox #2 is  NOT Selected. Verification PASSED");
        }else{
            System.out.println("CheckBox#2 is Selected. Verification FAILED");
        }

    }
}
