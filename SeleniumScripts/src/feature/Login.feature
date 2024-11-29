Feature: Orange Login

Scenario Outline: Verify Orange Login with valid Data

Given User should on Orange Home Page

When User enter "<UserName>" and "<Password>" click on login

Then User Validates Login Functionality

Examples:

           | UserName | Password |
           | Admin    | Admin |
           | Selenium | Admin |
           | Testing | Mindq |