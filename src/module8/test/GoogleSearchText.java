package module8.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.object.GoogleHomePageObject;

public class GoogleSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com");
		
		GoogleHomePageObject  page = new GoogleHomePageObject(driver);
		
		// Search with the Text
		page.txtSearch.sendKeys("SeleniumHQ");
		
		// Click on the Button for the search
		page.btnSearch.submit();
		

	}

}
