package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="monthId")
    public WebElement monthOfBirth;

    @FindBy(id="day")
    public WebElement dayOfBirth;

    @FindBy(id="year")
    public WebElement yearOfBirth;

    @FindBy(id="postalCode")
    public WebElement postalCode;

    @FindBy(xpath="//button[.='Previous']")
    public WebElement previousButton;

    @FindBy(xpath="//button[.='Search']")
    public WebElement searchButton;

    @FindBy(xpath="//a[.='Start Over']")
    public WebElement startOverLink;

    @FindBy(id="streetList")
    public WebElement selectAddress;

    @FindBy(id="addressNumber")
    public WebElement streetNumber;

    @FindBy(id="addressNumberSuffixId")
    public WebElement suffix;

    @FindBy(id="unitNumber")
    public WebElement unitNumber;

    @FindBy(id="streetName")
    public WebElement streetName;

    @FindBy(id="streetTypeId")
    public WebElement streetType;

    @FindBy(id="streetDirectionId")
    public WebElement streetDirection;

    @FindBy(id="placeName")
    public WebElement city;


}
