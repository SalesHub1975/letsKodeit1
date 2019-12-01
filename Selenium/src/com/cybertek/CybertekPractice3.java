package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        //locate searchBox
       WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

       //locate submitButton
        WebElement submitButton = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));

        searchBox.sendKeys("wooden spoon");
        submitButton.click();

        String expectedTitle = "wooden spoon";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        //verify the text under search box contains given keyword "wooden spoon"

        WebElement resultContainer = driver.findElement(
                By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]"));
        // another locator --> //span[@class='a-color-state a-text-bold']

        String resultContainerText = resultContainer.getText();

        if(resultContainerText.contains(expectedTitle)){
            System.out.println("Text verification is passed!");
        }else{
            System.out.println("Text verification is failed!!!");
        }


    }
}
