

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w =new Welcome(driver);
		w.clickOnMyAccount();
		Login l=new Login(driver);
		l.typeemail("poojapmathad97@gmail.com");
		l.typepassword("Welcome@123");
		l.clicklogin();
		Home h=new Home(driver);
		h.clicklogout();
		driver.quit();

	}

}
