package steps;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script2 {

WebDriver d1;
	
	@Given("Open chrome browser and enter iTime url")
	public void open_chrome_browser_and_enter_iTime_url() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Nivetha nagaraj\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		d1=new ChromeDriver();
		d1.get("https://www.myhcl.com/bprhome/Home/Index");
		//d1.manage().window().maximize();
	}

	@When("Enter username,password to log in")
	public void enter_username_password_to_log_in() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(d1,30);
		
		//using PageFactory in POM framework
		PageFactory.initElements(d1, elements.class);
		wait.until(ExpectedConditions.visibilityOf(elements.username));
		elements.username.sendKeys("nivethan@hcl.com");
		elements.next_button.click();
		wait.until(ExpectedConditions.visibilityOf(elements.password));
		elements.password.sendKeys("nive@12N");
		elements.sign_in.click();
		System.out.println("success");
	}

	@When("Manually approve the authentication")
	public void manually_approve_the_authentication() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(d1,30);
		
		wait.until(ExpectedConditions.visibilityOf(elements.yes_button));
		elements.yes_button.click();
		System.out.println("success");
	}

	@When("Search for iTime in MyHcl portal")
	public void search_for_iTime_in_MyHcl_portal() throws InterruptedException, IOException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(d1,30);
		
		//search box in myHcl page
		
				wait.until(ExpectedConditions.visibilityOf(elements.search));
				
				Robot r1=new Robot();
				Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rect=new Rectangle(scr_size);
				BufferedImage source=r1.createScreenCapture(rect);
				File dest=new File("C:\\Users\\Nivetha nagaraj\\Desktop\\reports\\shot1.jpg");
				ImageIO.write(source,"jpg", dest);
				
				elements.search.sendKeys("itime");
				
				//select the option from drop-down shown
				
				Thread.sleep(2000);
				Robot r2=new Robot();
				r2.keyPress(KeyEvent.VK_DOWN);
				r2.keyRelease(KeyEvent.VK_DOWN);
				r2.keyPress(KeyEvent.VK_ENTER);
				r2.keyRelease(KeyEvent.VK_ENTER);
				
				System.out.println("success");
	}

	@Then("Time entries successfully marked")
	public void time_entries_successfully_marked() throws IOException, AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(d1,30);
				//mark time hours
		
				wait.until(ExpectedConditions.visibilityOf(elements.time_entry));
				elements.time_entry.clear();
				
				Thread.sleep(2000);
				Robot r3=new Robot();
				Dimension scr_size1=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rect1=new Rectangle(scr_size1);
				BufferedImage source1=r3.createScreenCapture(rect1);
				File dest1=new File("C:\\Users\\Nivetha nagaraj\\Desktop\\reports\\shot2.jpg");
				ImageIO.write(source1,"jpg", dest1);
				
				elements.time_entry.sendKeys("9");
				elements.save_button.click();

				//full screenshot of the final outcome
				Thread.sleep(3000);
				
				Robot r4=new Robot();
				Dimension scr_size2=Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rect2=new Rectangle(scr_size2);
				BufferedImage source2=r4.createScreenCapture(rect2);
				File dest2=new File("C:\\Users\\Nivetha nagaraj\\Desktop\\reports\\shot3.jpg");
				ImageIO.write(source2,"jpg", dest2);
		System.out.println("success");
	}

}


