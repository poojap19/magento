

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	By username=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	
	public void typeemail(String email)
	{
		driver.findElement(username).sendKeys("poojapmathad97@gmail.com");
		
	}
	public void typepassword(String password)
	{
		driver.findElement(pwd).sendKeys("welcome@123");
	}
	
    public void clicklogin()
    {
    	driver.findElement(login).click();
    }

	
	

}
