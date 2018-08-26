package module7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {

	
	public void test1() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:5566/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(url, cap);
		
		driver.get("http://www.google.com");
		
		System.out.println("Title is - "+ driver.getTitle());
				
	}
}