package Validation.Movie_details;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\Validation\\Movie_details\\test.feature",
			tags="@validation",
			glue={"steps"},monochrome=true)
	public class runner {         }

