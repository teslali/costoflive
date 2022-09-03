Feature: Login 

@Login
Scenario Outline: Login with valid and invalid credentials

Given User is on landing page
When User clicked login button
Then User entered <Email> and <Password>

Examples:
| Email | Password |
| umutcankaryagdi@gmail.com | sifre123 | 
| testdum@abc.com | abcabc |


@AddPrice
Scenario Outline: Add price
Given User is on landing page
And User clicked login button
When User entered <Email> and <Password>
And User searched <City>
Then User added <Price> to product
Examples:
| City | Price| Email | Password |
| Istanbul | 0.85| umutcankaryagdi@gmail.com |sifre123|
| Barcelona | 0.7 | umutcankaryagdi@gmail.com |sifre123|
