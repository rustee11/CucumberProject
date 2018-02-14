[
  {
    "line": 1,
    "elements": [
      {
        "line": 3,
        "name": "Successful Login with Valid Credentials",
        "description": "",
        "id": "login-action;successful-login-with-valid-credentials",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 11916904053,
              "status": "passed"
            },
            "line": 4,
            "name": "User is on Home Page",
            "match": {
              "location": "StepDef.browserLaunch()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 759785523,
              "status": "passed"
            },
            "line": 5,
            "name": "Enter_Firstname and Lastname",
            "match": {
              "location": "StepDef.userName()"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 157663018,
              "status": "passed"
            },
            "line": 6,
            "name": "Logout the browser",
            "match": {
              "location": "StepDef.logout()"
            },
            "keyword": "Then "
          }
        ]
      }
    ],
    "name": "Login Action",
    "description": "",
    "id": "login-action",
    "keyword": "Feature",
    "uri": "features/TestCase1.feature",
    "tags": []
  },
  {
    "line": 1,
    "elements": [
      {
        "line": 3,
        "name": "Successful Login with Valid Credentials",
        "description": "",
        "id": "login-action;successful-login-with-valid-credentials",
        "type": "scenario",
        "keyword": "Scenario",
        "steps": [
          {
            "result": {
              "duration": 9665849258,
              "status": "passed"
            },
            "line": 4,
            "name": "User is on Home Page",
            "match": {
              "location": "StepDef.browserLaunch()"
            },
            "keyword": "Given "
          },
          {
            "result": {
              "duration": 886616179,
              "status": "passed"
            },
            "line": 5,
            "name": "Enter_Firstname and Lastname",
            "match": {
              "location": "StepDef.userName()"
            },
            "keyword": "When "
          },
          {
            "result": {
              "duration": 2158636612,
              "status": "passed"
            },
            "line": 6,
            "name": "verify and Logout the browser",
            "match": {
              "location": "StepDef.verify_and_Logout_the_browser()"
            },
            "keyword": "Then "
          }
        ]
      }
    ],
    "name": "Login Action",
    "description": "",
    "id": "login-action",
    "keyword": "Feature",
    "uri": "features/TestCase2.feature",
    "tags": []
  }
]