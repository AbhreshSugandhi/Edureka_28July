package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		
		oSelect.selectByIndex(0);
		
		Thread.sleep(5000);
				
		//Select By Index
		oSelect.selectByIndex(2);
		
		Thread.sleep(5000);
		
		//Select By VisibleText
		oSelect.selectByVisibleText("SouthAmerica");
		
		Thread.sleep(5000);
		
		//Select By Value
		oSelect.selectByValue("g");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}










