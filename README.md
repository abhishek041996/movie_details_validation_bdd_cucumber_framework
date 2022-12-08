Here i have automated the Wikipedia and IMDB website to search for a movie details and validate it.

I have used cucumber BDD framework for it and all the dependencies are added in pom.xml file.

I have used latest version of selenium 4.6.0 where external chrome driver is not required now.

In the main folder under Validation.Movie_details package i have stored the launch details and the runner class

In the main folder in steps packages i have stored the steps class where all the steps definitions are defined.

In the test folder i have stored the feature file

To run these the test we need to copy the tag name of the scenario from the feature file and paste it in the runner 
class and run the runner class using the junit test

OUTPUT:-The country name and release date for the movie "pushpa:the rise" are same on Wikipedia and IMDB website