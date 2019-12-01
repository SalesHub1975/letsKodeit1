package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.SearchResults;
import utilities.Config;
import utilities.Driver;

public class RegistrationStepDefs {

    HomePage hp = new HomePage();

    @Given("User is on Homepage")
    public void user_is_on_Homepage() {
        Driver.getDriver().get(Config.getProperty("testUrl"));
    }

    @When("User provides full name and date of birth")
    public void user_provides_full_name_and_date_of_birth() {
      hp.firstName.sendKeys("James");
      hp.middleName.sendKeys("AnyMiddleName");
      hp.lastName.sendKeys("Bond");
      hp.monthOfBirth.sendKeys("January");
      hp.dayOfBirth.sendKeys("10");
      hp.yearOfBirth.sendKeys("1980");
    }

    @When("User provides zipcode")
    public void user_provides_zipcode() {
        hp.postalCode.sendKeys("M4B 1B5");
    }

    @Then("verify select address field is displayed")
    public void verify_select_address_field_is_displayed() {
        Assert.assertTrue(hp.selectAddress.isDisplayed());
    }

    @Then("User selects the last option from dropdown")
    public void user_selects_the_last_option_from_dropdown() {
        hp.selectAddress.sendKeys("My street and place is not listed. Let me enter it below manually.");
    }

    @Then("User provides his full address")
    public void user_provides_his_full_address() {
        hp.streetNumber.sendKeys("123");
        hp.suffix.sendKeys("A");
        hp.unitNumber.sendKeys("1B");
        hp.streetName.sendKeys("Main");
        hp.streetType.sendKeys("Road");
        hp.streetDirection.sendKeys("North/Nord");
        hp.city.sendKeys("Toronto");
    }

    @Then("User clicks search button")
    public void user_clicks_search_button() {
        hp.searchButton.click();
    }

    @Then("verify search result page is displayed")
    public void verify_search_result_page_is_displayed() {
        SearchResults sr = new SearchResults();
        Assert.assertTrue(sr.notFoundMessage.getText().equals("We could not find you with the information provided."));
    }



}
