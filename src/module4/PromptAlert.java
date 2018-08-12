package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
	
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.findElement(By.id("prompt")).click();

		//Thread.sleep(5000);

		Alert pa = driver.switchTo().alert();
		
		pa.sendKeys("Abhresh Sugandhi");

		//Thread.sleep(5000);
		
		pa.accept();
		
		//Thread.sleep(5000);
		
		driver.close();

	}

}



