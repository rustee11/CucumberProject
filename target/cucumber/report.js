[
  {
    "line": 2,
    "elements": [
      {
        "line": 5,
        "name": "Successful Login with Valid Credentials",
        "description": "",
        "id": "login-action;successful-login-with-valid-credentials",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 11596824341,
              "status": "passed"
            },
            "line": 6,
            "name": "User is on Home Page",
            "match": {
              "location": "StepDef.browserLaunch()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027org.stepdefinition.StepDef.enter_firstname_and_Lastname(DataTable) in file:/D:/eclipse-jee-neon-3-win32-x86_64/Workspace/vinothrustee/Cucumber/bin/\u0027 with pattern [^Enter_Firstname and Lastname$] is declared with 1 parameters. However, the gherkin step has 0 arguments []. \nStep text: Enter_Firstname and Lastname\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:111)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:66)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\r\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\r\n\tat cucumber.api.TestStep.run(TestStep.java:83)\r\n\tat cucumber.api.TestCase.run(TestCase.java:58)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
              "duration": 2815945,
              "status": "failed"
            },
            "line": 7,
            "name": "Enter_Firstname and Lastname",
            "match": {
              "location": "StepDef.enter_firstname_and_Lastname(DataTable)"
            },
            "keyword": "When "
          },
          {
            "result": {
              "status": "undefined"
            },
            "line": 8,
            "name": "Logout the browser",
            "match": {},
            "keyword": "Then "
          }
        ],
        "tags": [
          {
            "name": "@tag"
          },
          {
            "name": "@tag1"
          }
        ]
      }
    ],
    "name": "Login Action",
    "description": "",
    "id": "login-action",
    "keyword": "Feature",
    "uri": "features/TestCase1.feature",
    "tags": [
      {
        "name": "@tag",
        "type": "Tag",
        "location": {
          "line": 1,
          "column": 1
        }
      }
    ]
  },
  {
    "line": 2,
    "elements": [
      {
        "line": 12,
        "name": "Successful Login with Valid Credentials",
        "description": "",
        "id": "login-action;successful-login-with-valid-credentials;;2",
        "type": "scenario",
        "keyword": "Scenario Outline",
        "steps": [
          {
            "result": {
              "duration": 8534279350,
              "status": "passed"
            },
            "line": 6,
            "name": "User is on Home Page",
            "match": {
              "location": "StepDef.browserLaunch()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 459769634,
              "status": "passed"
            },
            "line": 7,
            "name": "Enter \"vinoth\" and \"rusty\"",
            "match": {
              "arguments": [
                {
                  "val": "vinoth",
                  "offset": 7
                },
                {
                  "val": "rusty",
                  "offset": 20
                }
              ],
              "location": "StepDef.enter_and(String,String)"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 2375358579,
              "status": "passed"
            },
            "line": 8,
            "name": "verify the entered \"vinoth\" and\"rusty\"",
            "match": {
              "arguments": [
                {
                  "val": "vinoth",
                  "offset": 20
                },
                {
                  "val": "rusty",
                  "offset": 32
                }
              ],
              "location": "StepDef.verify_the_entered_and(String,String)"
            },
            "keyword": "Then "
          }
        ],
        "tags": [
          {
            "name": "@tag"
          },
          {
            "name": "@tag1"
          }
        ]
      }
    ],
    "name": "Login Action",
    "description": "",
    "id": "login-action",
    "keyword": "Feature",
    "uri": "features/TestCase2.feature",
    "tags": [
      {
        "name": "@tag",
        "type": "Tag",
        "location": {
          "line": 1,
          "column": 1
        }
      }
    ]
  },
  {
    "line": 2,
    "elements": [
      {
        "line": 4,
        "name": "L",
        "description": "",
        "id": "login-action;l",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 9367827596,
              "status": "passed"
            },
            "line": 5,
            "name": "User is on Home Page",
            "match": {
              "location": "StepDef.browserLaunch()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "error_message": "java.lang.ClassCastException: java.util.Collections$UnmodifiableMap cannot be cast to java.util.List\r\n\tat org.stepdefinition.StepDef.enter_firstname_and_Lastname(StepDef.java:64)\r\n\tat ✽.Enter_Firstname and Lastname(features/TestCase3.feature:6)\r\n",
              "duration": 1642116,
              "status": "failed"
            },
            "line": 6,
            "name": "Enter_Firstname and Lastname",
            "match": {
              "location": "StepDef.enter_firstname_and_Lastname(DataTable)"
            },
            "rows": [
              {
                "cells": [
                  "fname",
                  "lname"
                ]
              },
              {
                "cells": [
                  "vinoth",
                  "rustee"
                ]
              },
              {
                "cells": [
                  "Karlitto",
                  "Corner"
                ]
              }
            ],
            "keyword": "When "
          },
          {
            "result": {
              "status": "skipped"
            },
            "line": 10,
            "name": "verify Firstname and Lastname",
            "match": {
              "location": "StepDef.verify_Firstname_and_Lastname()"
            },
            "keyword": "Then "
          }
        ],
        "tags": [
          {
            "name": "@tag"
          },
          {
            "name": "@tag1"
          }
        ]
      }
    ],
    "name": "Login Action",
    "description": "",
    "id": "login-action",
    "keyword": "Feature",
    "uri": "features/TestCase3.feature",
    "tags": [
      {
        "name": "@tag",
        "type": "Tag",
        "location": {
          "line": 1,
          "column": 1
        }
      }
    ]
  },
  {
    "line": 2,
    "elements": [
      {
        "line": 5,
        "name": "Enter the Country",
        "description": "",
        "id": "login-action;enter-the-country",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 8957613022,
              "status": "passed"
            },
            "line": 6,
            "name": "User is on demoqa home Page",
            "match": {
              "location": "StepDef.user_is_on_demoqa_home_Page()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "error_message": "java.lang.IndexOutOfBoundsException: Index: 1, Size: 1\r\n\tat java.util.ArrayList.rangeCheck(Unknown Source)\r\n\tat java.util.ArrayList.get(Unknown Source)\r\n\tat java.util.Collections$UnmodifiableList.get(Unknown Source)\r\n\tat org.stepdefinition.StepDef.enter_the_Country(StepDef.java:87)\r\n\tat ✽.Enter the Country(features/TestCase4.feature:7)\r\n",
              "duration": 20554153,
              "status": "failed"
            },
            "line": 7,
            "name": "Enter the Country",
            "match": {
              "location": "StepDef.enter_the_Country(DataTable)"
            },
            "rows": [
              {
                "cells": [
                  "country"
                ]
              },
              {
                "cells": [
                  "india"
                ]
              },
              {
                "cells": [
                  "australia"
                ]
              },
              {
                "cells": [
                  "pakistan"
                ]
              },
              {
                "cells": [
                  "Africa"
                ]
              }
            ],
            "keyword": "When "
          },
          {
            "result": {
              "status": "skipped"
            },
            "line": 13,
            "name": "verify the country",
            "match": {
              "location": "StepDef.verify_the_country()"
            },
            "keyword": "Then "
          }
        ],
        "tags": [
          {
            "name": "@tag"
          },
          {
            "name": "@tag1"
          }
        ]
      }
    ],
    "name": "Login Action",
    "description": "",
    "id": "login-action",
    "keyword": "Feature",
    "uri": "features/TestCase4.feature",
    "tags": [
      {
        "name": "@tag",
        "type": "Tag",
        "location": {
          "line": 1,
          "column": 1
        }
      }
    ]
  }
]