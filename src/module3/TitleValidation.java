package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String appTitle = driver.getTitle();
		
		System.out.println(appTitle);

		boolean result = appTitle.equals("Google");

		System.out.println("result - " + result);

	}

}
