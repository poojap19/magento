

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By logout=By.linkText("Logout");
	 
	public void clicklogout()
	{
		driver.findElement(logout).click();
		
	}

}
