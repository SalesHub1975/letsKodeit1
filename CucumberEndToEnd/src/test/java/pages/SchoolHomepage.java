package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchoolHomepage {

    public SchoolHomepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains (text(), 'Students')])[1]")
    public WebElement studentsMenu;

    @FindBy(xpath = "//a[contains (text(), 'All Students')]")
    public WebElement allStudentButton;

    @FindBy(xpath = "//a[contains (text(), 'Add Student')]")
    public WebElement addStudentButton;


    @FindBy(xpath = "//span[@class='text-uppercase']")
    public WebElement schoolButton;

}
