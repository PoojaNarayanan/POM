Feature: Login to LeafTaps


    
    
@smoke @regression
Scenario Outline: Create Leadb
    
    Given Enter UserName.DemoSalesManager
    And Enter Password.crmsfa
    And Click on the Login Button
    And Click on CRM/SFA.
    And Click on Lead Tab.
    And Click on CreateLeadShortcut.
    And Enter Company Name <CompanyName>
    And Enter FirstName <FirstName>
    And Enter LastName <LastName>
    When Click on Create Lead
    Then Verify Lead is Created
		
		Examples:
		| FirstName| LastName | CompanyName |
		| Pooja | Harish | ABC |
		| Malini | Nagraj | Hexa |
		| Nitu | Vignesh | TCS |
    