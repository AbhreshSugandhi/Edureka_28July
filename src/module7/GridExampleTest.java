package module7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GridExampleTest {
	
	public RemoteWebDriver driver;
	public static String appURL = "http://www.google.com";
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		//System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://localhost:5566/wd/hub"), capabilities);
		//driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitle() {
		System.out.println("*** Navigation to Application ***");
		driver.navigate().to(appURL);
		String strPageTitle = driver.getTitle();
		System.out.println("*** Verifying page title ***");
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	@AfterClass
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}