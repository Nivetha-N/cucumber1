Feature: Automate the iTime application

Scenario: Automate the login page and mark time entry
  Given Open chrome browser and enter iTime url
  When Enter username,password to log in 
  And Manually approve the authentication
  And Search for iTime in MyHcl portal
  Then Time entries successfully marked	