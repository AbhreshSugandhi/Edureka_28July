package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateElement {

	public static void main(String[] args) {
		
		// Instantiate a Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		driver.findElement(By.id("profession-0")).click();
		
		WebElement a = driver.findElement(By.id("profession-0"));
		
		boolean r = a.isSelected();
		
		System.out.println(r);
		

	}

}
