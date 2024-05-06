package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_google_home_page() {
	   driver = new ChromeDriver();
	driver.manage().window().maximize();
	   driver.get("https://the-internet.herokuapp.com/login");
	  }
	@When("User enters credentials")
	public void user_search_java_tutorial() {
		 driver.get("https://the-internet.herokuapp.com/login");
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
	  driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	}
	@Then("Should display SuccessMsg")
	public void should_display_java_tutorial_page() {
	    boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);  
		driver.close();
}

}
