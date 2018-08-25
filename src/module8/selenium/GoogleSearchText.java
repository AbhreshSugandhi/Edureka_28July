package module8.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import module8.selenium.GoogleHomePageObjects;
import module8.selenium.SeleniumHomePageObject;

public class GoogleSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.SearchGoogle("SeleniumHQ");
		
		page.ClickSelenium();
		Thread.sleep(5000);
		
		SeleniumHomePageObject Sel = new SeleniumHomePageObject(driver);

		Thread.sleep(5000);
		Sel.ClickDownload();
		
		Thread.sleep(5000);
		Sel.ClickHome();
		
	}
}
