package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		Select oSelect = new Select(driver.findElement(By.id("selenium_commands")));
		
		//Select by index & Deselect by Visible Text
		oSelect.selectByIndex(2);
		//Thread.sleep(5000);
		oSelect.deselectByVisibleText("Switch Commands");;
		//Thread.sleep(5000);

		List<WebElement> oSize = oSelect.getOptions();
		
		int ilistsize = oSize.size();
		
		for(int i=0; i<ilistsize; i++) {
			
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			//Thread.sleep(6000);
			//Selecting based on the value of I
			oSelect.selectByIndex(i);
			//Thread.sleep(6000);
		}
		
		oSelect.deselectAll();
		//Thread.sleep(6000);
		driver.close();
		
	}

}





