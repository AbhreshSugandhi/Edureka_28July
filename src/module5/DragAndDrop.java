package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/droppable/");

		Actions act = new Actions(driver);

		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		
		WebElement From = driver.findElement(By.id("draggable"));
		
		WebElement To = driver.findElement(By.id("droppable"));

		Thread.sleep(5000);
		
		act.dragAndDrop(From, To).build().perform();
		
	}

}








