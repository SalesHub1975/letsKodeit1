package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys("Iphone X" + Keys.ENTER);

        String expectedInTitle = "Iphone X";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


    }
}
