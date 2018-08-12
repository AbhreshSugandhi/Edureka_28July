package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("confirm")).click();
	
		Thread.sleep(4000);
		
		Alert ca = driver.switchTo().alert();
		
		String AlertMsg = ca.getText();
		
		System.out.println(AlertMsg);
		
		//ca.dismiss();
		ca.accept();
		
		Thread.sleep(4000);

		driver.close();
		
	}

}
