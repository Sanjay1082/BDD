Feature:  Validate login functionality of the Ecommerce Website

Scenario: Validate login functionality
Given : User at login page
When : User navigate to loginpage
When : User provide the login information as below
|UserName | Password|
|Test1234 | Test1234|
And user click on login button
Then User should be logged in
