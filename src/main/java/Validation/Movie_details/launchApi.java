package Validation.Movie_details;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchApi {
	WebDriver driver;

	public void launch(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			 driver=new ChromeDriver();
		}
		else{
			 driver=new FirefoxDriver();
		}
		
	}

	public ArrayList<String> search(String url1) {
		ArrayList<String> wikipediaDetails=new ArrayList<String>();
		driver.get(url1);
		driver.manage().window().maximize();
		
		String releaseDate = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")).getText();
		System.out.println(releaseDate);
		
		String country = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")).getText();
		System.out.println(country);
		
		wikipediaDetails.add(releaseDate);
		wikipediaDetails.add(country);
		return wikipediaDetails;
	}

	public ArrayList<String> find(String url2) {
		ArrayList<String> imdbDetails=new ArrayList<String>();
		driver.get(url2);
		
        String releaseDate = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[11]/div[2]/ul/li[1]/div/ul/li/a")).getText();
       
        releaseDate=releaseDate.replace(",", "").replace("(United States)", "");
        String[] split = releaseDate.split(" ");
        releaseDate=split[1].concat(" ").concat(split[0]).concat(" ").concat(split[2]);
        System.out.println(releaseDate);
        String country = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[11]/div[2]/ul/li[2]/div/ul/li/a")).getText();
        System.out.println(country);
        
        imdbDetails.add(releaseDate);
		imdbDetails.add(country);
		return imdbDetails;
	}

	public void verify(ArrayList<String> imdbDetails, ArrayList<String> wikipediaDetails) {
		assertEquals(imdbDetails.get(0),wikipediaDetails.get(0));
		assertEquals(imdbDetails.get(1),wikipediaDetails.get(1));
		
	}
		
		
	}


