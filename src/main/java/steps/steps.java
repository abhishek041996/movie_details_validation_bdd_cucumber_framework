package steps;


import java.util.ArrayList;

import Validation.Movie_details.launchApi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
launchApi launchapi=new launchApi();
ArrayList<String> imdbDetails,wikipediaDetails;

@Given("user with {string} to launch")
public void launch(String Browser) {
	launchapi.launch(Browser);
		
}
@When("user searches for the given {string} and fetches the required details")
public void user_searches_for_url1(String url1) {
    wikipediaDetails = launchapi.search(url1);
}

@Then("user searches for the other given {string} and fetches the required details")
public void user_searches_for_url2(String url2) {
	 imdbDetails =launchapi.find(url2);
}

@And ("user verifies the details from both the URL are same")
public void verify(){
	
	launchapi.verify(imdbDetails,wikipediaDetails);
}
}
