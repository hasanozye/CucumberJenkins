Feature: Store Product Name and Use in Different Application

  Scenario: Save last product name from search results and use it in another application
    Given I navigate to "http://opencart.abstracta.us/"
    When  I search for "mac"
    And   I save the name of the last product in the search results
    And   I open a new tab and navigate to "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    And   I login into the application
    And   I click on "Admin" menu
    And   I enter the saved product name into the username input field
    Then  I take a screenshot of the screen