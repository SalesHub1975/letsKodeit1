package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.AddNewStudentPage;
import pages.SchoolHomepage;
import utilities.Config;
import utilities.DBUtility;
import utilities.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddStudent {

    AddNewStudentPage addNewStudentPage = new AddNewStudentPage();
    SchoolHomepage sh = new SchoolHomepage();

    @Given("User is on School Homepage")
    public void user_is_on_School_Homepage() {
        Driver.getDriver().get(Config.getProperty("schoolUrl"));
    }


    @When("User goes Students module and click Add Student button")
    public void user_goes_Students_module_and_click_Add_Student_button() throws InterruptedException{
        Thread.sleep(2000);
        sh.studentsMenu.click();
        sh.addStudentButton.click();
    }




    @When("User provides his personal information and clicks submit button")
    public void user_provides_his_personal_information_and_clicks_submit_button() throws InterruptedException{

        addNewStudentPage.studentFirstName.sendKeys(Config.getProperty("studentFirstName"));
        addNewStudentPage.studentLastName.sendKeys(Config.getProperty("studentLastName"));
        addNewStudentPage.studentEmail.sendKeys(Config.getProperty("studentEmail"));
        addNewStudentPage.studentJoiningDate.sendKeys(Config.getProperty("studentJoiningDate"));
        addNewStudentPage.studentPassword.clear();
        addNewStudentPage.studentPassword.sendKeys(Config.getProperty("studentPassword"));
        addNewStudentPage.studentSubject.sendKeys(Config.getProperty("studentSubject"));
        addNewStudentPage.studentModilePhone.sendKeys(Config.getProperty("studentModilePhone"));
        Select select = new Select(addNewStudentPage.studentGender);
        select.selectByVisibleText(Config.getProperty("studentGender"));
        addNewStudentPage.studentAdmissionNo.clear();
        addNewStudentPage.studentAdmissionNo.sendKeys(Config.getProperty("studentAdmissionNo"));
        addNewStudentPage.studentDateOfBirth.sendKeys(Config.getProperty("studentDateOfBirth"));
        addNewStudentPage.studentMajor.sendKeys(Config.getProperty("studentMajor"));
        Select select1 = new Select(addNewStudentPage.studentBatch);
        select1.selectByVisibleText(Config.getProperty("studentBatch"));
        addNewStudentPage.studentSection.clear();
        addNewStudentPage.studentSection.sendKeys(Config.getProperty("studentSection"));
        addNewStudentPage.studentAddress.sendKeys(Config.getProperty("studentAddress"));
        addNewStudentPage.studentCompanyName.sendKeys(Config.getProperty("studentCompanyName"));
        addNewStudentPage.studentTitle.sendKeys(Config.getProperty("studentTitle"));
        addNewStudentPage.studentStartDate.sendKeys(Config.getProperty("studentStartDate"));
        addNewStudentPage.studentCompanyCity.sendKeys(Config.getProperty("studentCompanyCity"));
        addNewStudentPage.studentCompanyAddress.sendKeys(Config.getProperty("studentCompanyAddress"));
        addNewStudentPage.studentCompanyZipcode.sendKeys(Config.getProperty("studentCompanyZipcode"));
        addNewStudentPage.studentCompanyState.sendKeys(Config.getProperty("studentCompanyState"));
        addNewStudentPage.studentSubmit.click();
        Thread.sleep(5000);
    }

    @Then("User verifies information of new added student on UI page with database")
    public void user_verifies_information_of_new_added_student_on_UI_page_with_database() throws SQLException {

        sh.studentsMenu.click();
        sh.allStudentButton.click();
        WebElement sortByList = Driver.getDriver().findElement(By.xpath("//*[@class='list-view btn btn-link']"));
        sortByList.click();
        WebElement entries = Driver.getDriver().findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
        Select select = new Select(entries);
        select.selectByValue("100");


        String path = "//tr/td[.='" + Config.getProperty("studentEmail")+ "']/../td[2]";
        WebElement st_id = Driver.getDriver().findElement(By.xpath(path));
        String id = st_id.getText();
        String query = "select * from student where student_id = " +id + "";


        try {
            Connection connection = DriverManager.getConnection(Config.getProperty("schooldbUrl"),
                                Config.getProperty("schoolUsername"),
                                Config.getProperty("schoolPassword"));

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(query);

            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            String columName = metaData.getColumnName(1);

//            System.out.println("Column count: "+columnCount);
//            System.out.println("Column Name: "+columName);

            List<Map<String, Object>> myTable = new ArrayList<>();

            while(resultSet.next()){
                Map<String, Object> map = new HashMap<>();
                for(int i=1; i<=columnCount; i++){
                    map.put(metaData.getColumnName(i), resultSet.getObject(i));
                }
                myTable.add(map);
            }

            for(Map<String, Object> m: myTable){
                SoftAssert softAssert = new SoftAssert();

                Assert.assertEquals(m.get("STUDENT_ID").toString(), id);
                Assert.assertEquals(m.get("ADMISSION_NO").toString(), Config.getProperty("studentAdmissionNo"));
                Assert.assertEquals(m.get("BATCH").toString(), Config.getProperty("studentBatch"));
                softAssert.assertEquals(m.get("BIRTH_DATE").toString(), Config.getProperty("studentDateOfBirth"), "DOB is not matching");
                Assert.assertEquals(m.get("FIRST_NAME").toString(), Config.getProperty("studentFirstName"));
                Assert.assertEquals(m.get("GENDER").toString(), Config.getProperty("studentGender"));
                softAssert.assertEquals(m.get("JOIN_DATE").toString(), Config.getProperty("studentJoiningDate"), "Joining date is not matching");
                Assert.assertEquals(m.get("LAST_NAME").toString(), Config.getProperty("studentLastName"));
                Assert.assertEquals(m.get("MAJOR").toString(), Config.getProperty("studentMajor"));
                softAssert.assertEquals(m.get("PASSWORD").toString(), Config.getProperty("studentPassword"), "Password is not matching");
                Assert.assertEquals(m.get("SECTION").toString(), Config.getProperty("studentSection"));
                Assert.assertEquals(m.get("SUBJECT").toString(), Config.getProperty("studentSubject"));
                softAssert.assertAll();

            }

        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Failed to open connection!");
        }





    }

}
