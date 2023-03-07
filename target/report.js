$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Amazon.feature");
formatter.feature({
  "name": "To Validated the Username and Password for Amazon Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To Valid the username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to launch the Amazon Application",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.userToLaunchTheAmazonApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to Click Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.userToClickSigninButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To fill the Username in the user field",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toFillTheUsernameInTheUserField()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c9688568[995]\u003e but was:\u003c9688568[84]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat org.stepdefinition.Amazon.toFillTheUsernameInTheUserField(Amazon.java:26)\r\n\tat ✽.To fill the Username in the user field(file:src/test/resources/FeatureFile/Amazon.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User to Click Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.userToClickContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFile/login.feature");
formatter.feature({
  "name": "To Validate Login Functionality of Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to check the login invalid Email and valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to launch the Url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.userToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To fill the email in the User Field",
  "rows": [
    {
      "cells": [
        "email1",
        "selvaskkr@gmail.com"
      ]
    },
    {
      "cells": [
        "email2",
        "selvas@gmail.com"
      ]
    },
    {
      "cells": [
        "email3",
        "java123@gmail.com"
      ]
    },
    {
      "cells": [
        "email4",
        "maven34@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toFillTheEmailInTheUserField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To fill the password in the password Field",
  "rows": [
    {
      "cells": [
        "pass1",
        "pass2",
        "pass3"
      ]
    },
    {
      "cells": [
        "selvas3096",
        "selva9630",
        "java123"
      ]
    },
    {
      "cells": [
        "54789895",
        "maven7836",
        "sql234"
      ]
    },
    {
      "cells": [
        "selenium123",
        "879432125",
        "asfjwe"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.toFillThePasswordInThePasswordField(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userHaveToClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the valid Email and invalid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User to launch the Url",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.userToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To fill the email in the email field",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.toFillTheEmailInTheEmailField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To fill the password in the Password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.toFillThePasswordInThePasswordField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to Click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.userToClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});