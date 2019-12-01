package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankPractice3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //locate inputUsername
        WebElement inputUsername = driver.findElement(By.id("user_login"));
        //locate inputPassword
        WebElement inputPassword = driver.findElement(By.id("user_password"));
        //locate singIn button
        WebElement singInButton = driver.findElement(By.name("submit"));

        String expectedUsername = "username";

        inputUsername.sendKeys("username");
        inputPassword.sendKeys("password");
        singInButton.click();

        //locating actualProfileUsername
        WebElement actualProfileUsername = driver.findElement(By.linkText("username"));
        String actualUsernameText = actualProfileUsername.getText();

        if(actualUsernameText.contains(expectedUsername)){
            System.out.println("USername verification PASSED");
        }else{
            System.out.println("Username verification FAILED");
        }

        //locate accountSummaryHref
        String expectedInHref = "account-summary";
        WebElement actualSummaryLink = driver.findElement(By.linkText("Account Summary"));
        String actualHrefValue = actualSummaryLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("Expected HREF is inside of the Actual HREF");
            System.out.println("HREF verification PASSED");
        }else{
            System.out.println("Expected HREF is NOT inside of the Actual HREF");
            System.out.println("HREF verification FAILED");
        }

    }
}
