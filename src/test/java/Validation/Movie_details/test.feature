Feature: test for validation

@validation
Scenario: validate movie details
Given user with "<browser>" to launch
When user searches for the given "<url1>" and fetches the required details
Then user searches for the other given "<url2>" and fetches the required details
And user verifies the details from both the URL are same

Examples:
|browser|url1|url2|
|chrome|https://en.wikipedia.org/wiki/Pushpa:_The_Rise|https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0|
