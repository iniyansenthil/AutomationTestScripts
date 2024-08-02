@Request_A_Demo
Feature: Test the Mar
  Scenario Outline: Check login with valid credential
    Given User on Tendable Home page
    When click the Contact Us button
    And Click the contact button which from Marketing tag
    And User enter the full name <name>
    And User enter the Organisation <company>
    And  User enter the Phone Number <mobileno>
    And User enter the email id <mail>
    And User skip to enter the input on Message box.
    And User click the i agree button
    And User click submit button 
    Then user got error message because not enter the value on Messsage box.
    
    Examples:
    | name | company | mobileno | mail |
    | Iniyan | TCS | 823834998 | iniyan@gmail.com |
    
   

   