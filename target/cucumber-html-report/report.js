$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the website",
  "description": "",
  "id": "login-to-the-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Going to the login page",
  "description": "",
  "id": "login-to-the-website;going-to-the-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to www.amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I hover to the sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I wait till th dropdwon is visible",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be transferred to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iGoToWwwAmazonCom()"
});
formatter.result({
  "duration": 5348629400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iHoverToTheSignInButton()"
});
formatter.result({
  "duration": 446233800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iWaitTillThDropdwonIsVisible()"
});
formatter.result({
  "duration": 71233000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignInButton()"
});
formatter.result({
  "duration": 733530300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeTransferredToLoginPage()"
});
formatter.result({
  "duration": 3000555700,
  "status": "passed"
});
});