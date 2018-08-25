package module8.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {

	public GoogleHomePageObjects(WebDriver driver) {
		//there is a pagefactory concept in Selenium which we will innitialize to interact with the below element
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (name = "q")
	public WebElement txtSearch;
	
	@FindBy (xpath = "//*[@id='mKlEF']")
	public WebElement btnSearch;
	
	@FindBy (linkText = "Selenium - Web Browser Automation")
	public WebElement linkSelenium;
	
	public void SearchGoogle(String SearchTxt) {
		
		txtSearch.sendKeys(SearchTxt);
		
		btnSearch.submit();
	}
	
	public void ClickSelenium() {
		linkSelenium.click();
	}

}
