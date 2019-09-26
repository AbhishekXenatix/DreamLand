package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductListpage {

	public ProductListpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="yui_3_18_0_3_1569342537463_747")
	WebElement money;
	public void productlist()  {
		
		money.click();
		
	}
	
	
	

}
