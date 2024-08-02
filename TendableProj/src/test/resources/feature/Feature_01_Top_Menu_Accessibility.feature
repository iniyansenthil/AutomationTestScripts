@Top_Menu_Accesability 
Feature: Feature to test the tp level menu are Home, Our Story, Our Solution, and Why Tendable.
  Scenario Outline: Check all the menu button are working or not.
    Given User on Tendable page
    When click the Home button
    And Click the Our Story
    And Click the Our Solution button.
    And Click Why Tendable button
    