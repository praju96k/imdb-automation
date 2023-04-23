Feature: Imdb Create Account Functionality


Scenario: Create account functionality
Given a new user is on the home page
When the user clicks on the SignIn button 
And User clicks on create account button
And User Click on Create account after entering below details: 
| Username | Email           | Password |
| john     | john.example112@gmail.com| password123 |
Then the user should be redirected to solve puzzle page 

