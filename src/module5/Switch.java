package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");

		String handle = driver.getWindowHandle();

		System.out.println("Window A - " + handle);
		System.out.println("====================================================================");

		Thread.sleep(5000);

		driver.findElement(By.cssSelector(
				"#content > div:nth-child(2) > div:nth-child(2) > div > div.wpb_raw_code.wpb_content_element.wpb_raw_html > div > p:nth-child(5) > button"))
				.click();

		Set AllWindowName = driver.getWindowHandles();

		System.out.println("Window A+B - " + AllWindowName);
		System.out.println("====================================================================");

		for (String newHandle : driver.getWindowHandles()) {

			// System.out.println("newHandle");

			driver.switchTo().window(handle);
			Thread.sleep(5000);

			driver.switchTo().window(newHandle);
			Thread.sleep(5000);

		}
	}

}
