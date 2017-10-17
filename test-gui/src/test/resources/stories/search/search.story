Meta:
Lifecycle:
Before:
Given I am on google
Scenario: Should make a search
When Fill search bar with serenity
Then I should see the search button
