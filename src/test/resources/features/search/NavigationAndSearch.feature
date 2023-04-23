
Feature: Imdb Navigation and Search Functionality

Background: User is in IMDb Home Page
	Given a user is on the IMDb home page
	
Scenario: Navigate to Top Rated Shows
When the user clicks on the 'Menu' button displayed next to the IMDb logo
And selects the 'Top 250 TV Shows link' under the 'TV Shows' category
Then the user should be redirected to the Top Rated TV Shows page

Scenario: Search and select link from suggestion window
When the user searches for movie "Game of Thrones"
And selects from the suggestion window movie Game of Thrones: The Last Watch
Then the user should be redirected to the selected movie page "Game of Thrones: The Last Watch"
Then the title of the selected episode should be shown as "Game of Thrones: The Last Watch"
And the rating  should be shown as "IMDb RATING"
And the number of reviews Title should be visible as "User reviews"







    

  