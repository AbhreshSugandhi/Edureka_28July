package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
	
		//Instantiate Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "D:\\Training\\Installation stuff\\Exe Files\\geckodriver.exe");
		WebDriver ff = new FirefoxDriver();*/

		// Get Commands
		driver.get("URL"); // open url of the AUT
		driver.getTitle(); // Get the current Page title
		driver.getCurrentUrl(); // Get the current page URL
		driver.getWindowHandle(); // Get the name of the window helfull in switching from one window to other

		//Navigation commands
		driver.navigate().to("URL"); //to open URL
		driver.navigate().refresh(); // page refresh
		driver.navigate().back(); // navigate to previous page
		driver.navigate().forward(); // navigate to next page
		
		// Closeing Browser
		driver.close(); // to close the current active window in this session
		driver.quit(); // to close all the windows opened during this session
		
	}

}
