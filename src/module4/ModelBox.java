package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelBox {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2018/04/popups.html");

		driver.findElement(By.xpath("//a[@class = 'cd-popup-trigger' and @href = '#0']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Abhresh");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='alert']")).click();
		
		Thread.sleep(5000);
		
		Alert A = driver.switchTo().alert();

		A.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='close']")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
