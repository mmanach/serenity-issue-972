Meta:
@issue #TEST-123456
Lifecycle:
Before:
Given I am on google
After:
Outcome: ANY
Then I should see the search button
Scenario: Should make a search with after lifecycle
When Fill search bar with serenity
