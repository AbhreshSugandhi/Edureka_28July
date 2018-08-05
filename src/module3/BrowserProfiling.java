package module3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserProfiling {

	public static void main(String[] args) {
		
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile myprofile = profile.getProfile("WebDriverSelenium");
		
		// Initialize Firefox driver
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\Installation stuff\\Exe Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(myprofile);
		
		//Go to URL which you want to navigate
		driver.get("http://www.google.com");
		
		//Set  timeout  for 5 seconds so that the page may load properly within that time
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//close firefox browser
		driver.close();
	}
	}
	
