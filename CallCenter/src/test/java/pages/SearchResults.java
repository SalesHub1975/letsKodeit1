package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchResults {

    public SearchResults(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//h2[.='We could not find you with the information provided.']")
    public WebElement notFoundMessage;


}
