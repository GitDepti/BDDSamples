Feature: tasks CRUD Management
@SmokeTest
Scenario: Create a new Tasks
Given: User is logged in
When: User create a new Tasks
@RegressionTest
Scenario: View a Tasks
Given: User is logged in
When:User view tasks details

Scenario:Delete Tasks
Given: User is logged in
When: User delete Tasks
