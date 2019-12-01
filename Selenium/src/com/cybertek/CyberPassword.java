package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
Cybertek Practice:
Go to : http://practice.cybertekschool.com/forgot_password
Locate every single webelement on this page using xpath.
Make sure they are all displayed.
 */

public class CyberPassword {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate the homeLink
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        String homeLinkText = homeLink.getText();
        if(homeLink.isDisplayed() && homeLinkText.equals("Home")){
            System.out.println("Home Link verification passed");
        }else{
            System.out.println("Home Link verification FAILED");
            System.out.println("Either text is not matching or link is not displayed");
        }

        //locate forgot password header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']//h2"));
        String forgotPasswordHeaderText = forgotPasswordHeader.getText();
        if(forgotPasswordHeader.isDisplayed() && forgotPasswordHeaderText.equals("Forgot Password")){
            System.out.println("Forgot Password verification PASSED");
        }else{
            System.out.println("Forgot Password verification FAILED");
        }

        //locate email label
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        String emailLabelText = emailLabel.getText();
        if(emailLabel.isDisplayed() && emailLabelText.equals("E-mail")){
            System.out.println("Email label verification PASSED");
        }else {
            System.out.println("Email label verification FAILED");
        }

        //locate input emailbox
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
        if(emailBox.isDisplayed()){
            System.out.println("Input emailBox verification PASSED");
        }else{
            System.out.println("Input emailBox verification FAILED");
        }

        //locate retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        String retrievePasswordButtonText = retrievePasswordButton.getText();
        if (retrievePasswordButton.isDisplayed() && retrievePasswordButtonText.equals("Retrieve password")){
            System.out.println("RetrievePasswordButtonT verification is PASSED");
        }else{
            System.out.println("RetrievePasswordButtonT verification is FAILED");
        }

        //locate powered by cybertek footnote
        WebElement cybertekFootnote = driver.findElement(By.xpath("//div[contains(@style,'text-align')]"));
        String cybertekFootnoteText = cybertekFootnote.getText();
        if(cybertekFootnote.isDisplayed() && cybertekFootnoteText.equals("Powered by Cybertek School")){
            System.out.println("Footnote verification PASSED");
        }else{
            System.out.println("Footnote verification FAILED");
        }








    }
}
