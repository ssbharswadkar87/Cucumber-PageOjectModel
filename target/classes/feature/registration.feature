Feature: Cucumber Automation Practice

Scenario:	Application Registration

Given user is already on registartion page
When title of the page is Login - My Store
Then user enter emailid
Then user click on create an account button
Then user is on create customer page
Then user click on Title
Then user give name as FirstName
|FirstName|
|ABC|
|PQR|
Then user give surname as LastName
Then user give Password
Then user give Address
Then user give City
Then user select State
Then user give PostalCode
Then user give MobilePhone
Then user giveAddressAlias
Then close browser