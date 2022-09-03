Feature: Comparing two cities

@Compare
Scenario Outline: Compare two cities via dedicated section

Given User is on landing page
When User go to compare page
Then User compared <CityOne> and <CityTwo>

Examples:
| CityOne | CityTwo |
| New | Paris |



