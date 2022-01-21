package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {

	WebDriver d1;
	@Given("Open chrome browser and enter url")
	public void open_chrome_browser_and_enter_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nivetha nagaraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
	    
	}

	@When("Enter username,password and click login button")
	public void enter_username_password_and_click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    d1.findElement(By.id("userName")).sendKeys("nivethan@hcl.com");
	    d1.findElement(By.id("password")).sendKeys("hcl12345");
	    d1.findElement(By.id("submitBtn")).click();
	}

	@Then("Successfully logged in")
	public void successfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("successfully logged-in");
	}

}
