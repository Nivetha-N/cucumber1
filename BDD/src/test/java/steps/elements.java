

package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements {

	@FindBy(id="i0116")
	public static WebElement username;
	
	@FindBy(id="idSIButton9")
	public static WebElement next_button;
	
	@FindBy(id="i0118")
	public static WebElement password;
	
	@FindBy(id="idSIButton9")
	public static WebElement sign_in;
	
	@FindBy(id="idSIButton9")
	public static WebElement yes_button;
	
	@FindBy(id="txtSearch")
	public static WebElement search;
	
	@FindBy(xpath="//*[@id=\"mCSB_5_container\"]/span[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input")
	public static WebElement time_entry;
		
	@FindBy(id="le_apply")
	public static WebElement save_button;
}