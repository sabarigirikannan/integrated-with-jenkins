package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class homePage {

	
	
	private WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By searchField=By.id("twotabsearchtextbox");
	public String searchProduct(String product)
	{
		driver.findElement(searchField).sendKeys(product+Keys.ENTER);
		
		return driver.getTitle();
	}
	
	
}
