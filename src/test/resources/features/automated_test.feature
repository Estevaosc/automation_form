Feature: Complete Test Flow

  Scenario: Click on Automobile and Enter Vehicle Data
    Given I am on the homepage
    When I click on "Automobile"
    And I wait for the page to reload
    Then I should be on the Vehicle Data page

  Scenario: Enter Vehicle Data
    Given I am on the Vehicle Data page
    When I enter the vehicle data

  Scenario: Enter Insurant Data
    When I enter the insurant data and click Next
    Then I should see the Product Data tab

  Scenario: Enter Product Data and Proceed to the Next Step
    When I enter the product data and click on the "Next" button
    Then I should see the Select Price Option tab

  Scenario: Select Price Option
    When I select the price option "Silver"
    Then I should see the Send Quote tab

  Scenario: Fill and Send the Quote
    When I fill and send the quote
    Then I should see a confirmation message
