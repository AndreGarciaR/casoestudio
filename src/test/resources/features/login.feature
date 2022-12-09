Feature: GlobalSQA User Login
  As a registered user of the website
  I want to log in
  to work the web portal
  Scenario: successful login to the portal
  Given You are logged in to the application
  |user |password|
  |AndreGarcia|1234|
  When you click on the Login button
  Then you successfully login to the portal