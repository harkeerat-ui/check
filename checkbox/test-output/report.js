$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/checkbox.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i want to check the checkbox",
  "description": "",
  "id": "as-a-user-i-want-to-check-the-checkbox",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to check the checkbox",
  "description": "",
  "id": "as-a-user-i-want-to-check-the-checkbox;user-should-be-able-to-check-the-checkbox",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i am on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on checkbox of hippa notice",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify checkbox hippa is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "stepbystep.a_valid_user()"
});
formatter.result({
  "duration": 5772499500,
  "status": "passed"
});
formatter.match({
  "location": "stepbystep.user_goes_to_EXA_Login_site()"
});
formatter.result({
  "duration": 190297500,
  "status": "passed"
});
formatter.match({
  "location": "stepbystep.take_screenshot_of_checkbox()"
});
formatter.result({
  "duration": 779500500,
  "status": "passed"
});
});