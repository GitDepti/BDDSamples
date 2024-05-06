package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchstepdef {
	WebDriver driver;
	@Given("User is on Google home page")
	public void user_is_on_google_home_page() {
	   driver = new ChromeDriver();
	   
	driver.manage().window().maximize();
	   driver.get("https://www.google.com");
	   
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	    
	    WebElement srcBox= driver.findElement(By.className("gLFyf"));
	    srcBox.sendKeys("JAVA TUTORIAL");
	    srcBox.submit();
	}
	@Then("should display Java Tutorial page")
	public void should_display_java_tutorial_page() {
	Assert.assertEquals(driver.getTitle(), "JAVA TUTORIAL -Google Search");   
}
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		WebElement srcBox= driver.findElement(By.className("gLFyf"));
	    srcBox.sendKeys("SELENIUM TUTORIAL");
	    srcBox.submit();    
	}
	@Then("should display Selenium Tutorial page")
	public void should_display_selenium_tutorial_page() {
		Assert.assertEquals(driver.getTitle(), "SELENIUM TUTORIAL -Google Search");   
	}
}