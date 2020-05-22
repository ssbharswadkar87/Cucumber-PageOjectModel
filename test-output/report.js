$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Dell/eclipse-workspace/CucumberPageObjectModelProject/src/main/java/feature/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM application Test",
  "description": "",
  "id": "freecrm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate FreeCRM LoginPage",
  "description": "",
  "id": "freecrm-application-test;validate-freecrm-loginpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on application webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user provide username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate username after logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFreeCRMPageStepDefinition.user_is_on_application_webpage()"
});
formatter.result({
  "duration": 15182037900,
  "status": "passed"
});
formatter.match({
  "location": "LoginFreeCRMPageStepDefinition.validate_login_page()"
});
formatter.result({
  "duration": 18765100,
  "status": "passed"
});
formatter.match({
  "location": "LoginFreeCRMPageStepDefinition.validate_login_button()"
});
formatter.result({
  "duration": 101191801,
  "status": "passed"
});
formatter.match({
  "location": "LoginFreeCRMPageStepDefinition.user_provide_username_and_password()"
});
formatter.result({
  "duration": 804177000,
  "status": "passed"
});
formatter.match({
  "location": "LoginFreeCRMPageStepDefinition.user_click_on_Login_button()"
});
formatter.result({
  "duration": 8222500,
  "status": "passed"
});
formatter.match({
  "location": "LoginFreeCRMPageStepDefinition.validate_username_after_logged_in()"
});
formatter.result({
  "duration": 1470726500,
  "status": "passed"
});
});