$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/school.feature");
formatter.feature({
  "name": "Cybertek training feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding new student to school",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addingStudent"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on School Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AddStudent.user_is_on_School_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User goes Students module and click Add Student button",
  "keyword": "When "
});
formatter.match({
  "location": "AddStudent.user_goes_Students_module_and_click_Add_Student_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides his personal information and clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddStudent.user_provides_his_personal_information_and_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies information of new added student on UI page with database",
  "keyword": "Then "
});
formatter.match({
  "location": "AddStudent.user_verifies_information_of_new_added_student_on_UI_page_with_database()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tDOB is not matching expected [10/23/1992] but found [1992-10-23 00:00:00.0],\n\tJoining date is not matching expected [08/22/2019] but found [2019-08-22 00:00:00.0],\n\tPassword is not matching expected [abc123] but found [testabc123]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat steps.AddStudent.user_verifies_information_of_new_added_student_on_UI_page_with_database(AddStudent.java:137)\r\n\tat ✽.User verifies information of new added student on UI page with database(src/test/resources/features/school.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});