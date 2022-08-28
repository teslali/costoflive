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
