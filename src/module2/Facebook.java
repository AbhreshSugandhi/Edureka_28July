package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Instantiate Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://www.facebook.com");
		
/*		// Various Locator Techniques
		// ID locator
		driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		
		// Name Locator
		driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
	
		//Class name Locator
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		driver.findElement(By.className("inputtext")).sendKeys("Trainer");

		
		//Link Text & Partial Link text
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//Tagname locator
		List <WebElement>  list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	
		//css locator
		driver.findElement(By.cssSelector("#u_0_9")).click();
	
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
*/
		
		//Xpath Technique
		//Absolute Xpath - html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input
		//Relative Xpath - //input[@id='u_0_j']
	
		driver.findElement(By.xpath("//*[contains(@id,’username’)]")).sendKeys("Username");;
		
		
	}

}













