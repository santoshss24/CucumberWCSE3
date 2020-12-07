Feature: Login

Scenario Outline: login with valid credentials

Given user navigates to login page
And user enters <username> in username TextField
And user enters <password> in password TextField
When user clicks on login button
Then user should be navigated to homepage

Examples:

|username|password|
|admin|manager|
|trainee|trainee|
