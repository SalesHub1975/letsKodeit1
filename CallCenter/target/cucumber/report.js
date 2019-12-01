$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/eRegistration.feature");
formatter.feature({
  "name": "Validation of eRegistration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validating eregistration homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@happyPath"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationStepDefs.user_is_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides full name and date of birth",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationStepDefs.user_provides_full_name_and_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides zipcode",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.user_provides_zipcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify select address field is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.verify_select_address_field_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the last option from dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.user_selects_the_last_option_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides his full address",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.user_provides_his_full_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationStepDefs.user_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify search result page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefs.verify_search_result_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});