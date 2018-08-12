package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Event {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		WebElement Uname = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
		Action newact = act
				.moveToElement(Uname)
				.click()
				.keyDown(Uname, Keys.SHIFT)
				.sendKeys("abhresh")
				.keyUp(Uname, Keys.SHIFT)
				.doubleClick(Uname)
				.contextClick()
				.build();
		
		newact.perform();
		
				
	}

}
