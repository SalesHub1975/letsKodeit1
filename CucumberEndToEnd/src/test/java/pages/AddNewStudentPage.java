package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddNewStudentPage {


    public AddNewStudentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement studentFirstName;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement studentLastName;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement studentEmail;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement studentJoiningDate;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement studentPassword;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement studentConfirmPassword;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement studentSubject;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement studentModilePhone;

    @FindBy(xpath = "(//select)[1]")
    public WebElement studentGender;

    @FindBy(xpath = "//option[contains (text(), 'Female')]")
    public WebElement studentGenderFemale;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement studentAdmissionNo;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement studentDateOfBirth;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement studentMajor;

    @FindBy(xpath = "(//select)[2]")
    public WebElement studentBatch;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement studentSection;

    @FindBy(id = "message")
    public WebElement studentAddress;

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement studentCompanyName;

    @FindBy(xpath = "(//input[@type='text'])[14]")
    public WebElement studentTitle;

    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement studentStartDate;                 //sendkeys

    @FindBy(xpath = "(//input[@type='text'])[12]")
    public WebElement studentCompanyAddress;

    @FindBy(xpath = "(//input[@type='text'])[13]")
    public WebElement studentCompanyState;

    @FindBy(xpath = "(//input[@type='text'])[15]")
    public WebElement studentCompanyCity;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement studentCompanyZipcode;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement studentSubmit;









}
