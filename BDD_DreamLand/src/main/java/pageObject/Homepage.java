package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;

	public void searchhomepage() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Avyaan\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		    driver.get("https://us.yahoo.com");
		    
		    
	 }
	
	public void ProductListpage(){
		
	driver.close();
		
	}

}
