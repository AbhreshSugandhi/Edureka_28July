package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExecution {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		Thread.sleep(2000);
		
		driver.findElement(By.id("")).sendKeys("");
		
		driver.findElement(By.id("")).clear();
		
	}

}
