package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonwaits {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		//PageLoad
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		//SetScriptTimeOut
		//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Abhresh");

		
		
	}

}
