package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObject.Cartpage;
import pageObject.Checkoutpage;
import pageObject.Homepage;
import pageObject.ProductListpage;

public class Steps {
	WebDriver driver;
	
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Avyaan\\Downloads\\selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		    driver.get("https://www.nopcommerce.com");
	}

	@When("^he search the books$")
	public void he_search_the_books() {
		driver.findElement(By.xpath("//ul[@class='header-links-account']//a[@class='ico-register'][contains(text(),'Register')]")).click();
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item(){
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName']")).sendKeys("bhi");
		driver.findElement(By.xpath("//ul[@class='header-links-account']//a[@class='ico-login'][contains(text(),'Log in')]")).click();
	 
	}

	@When("^moves to checkout from cart$")
	public void moves_to_checkout_from_cart(){
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName']")).sendKeys("shek");
		
	}

	@When("^select payment method$")
	public void select_payment_method() {
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email']")).sendKeys("abhi@gmail.com");
	 
	}

	@When("^place the order$")
	public void place_the_order() {
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName']")).clear();
	 
	}



}
