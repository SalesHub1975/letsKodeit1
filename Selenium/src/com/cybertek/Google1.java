package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement googleSearch= driver.findElement(By.name("q"));
        WebElement storeLinkOnHomePage = driver.findElement(By.linkText("Store"));

        System.out.println(storeLinkOnHomePage.getText());

        googleSearch.sendKeys("anything" + Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement storeLinkOnHomePage2 = driver.findElement(By.linkText("Store"));

        System.out.println(storeLinkOnHomePage2.getText());
    }
}
