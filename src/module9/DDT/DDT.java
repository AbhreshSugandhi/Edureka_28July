package module9.DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDT {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	
	@BeforeTest
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\Installation stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");	
	}
	
	@Test(dataProvider = "TestData")
	public void TestAUT(String Fname, String Lname, String Add) throws InterruptedException {
		
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(Fname);
		
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(Lname);		
		
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Add);
		
		Thread.sleep(5000);
	}
	
	@DataProvider(name = "TestData")
	//now we will also include the parameter to the @Test annotation above so that the data will be transmitted to the String in a Sequence
	public Object[][]TestDataFeed() throws IOException, BiffException{
		
		FileInputStream fis = new FileInputStream("D:\\Training\\Programs\\Edureka_28July\\src\\module9\\DataFile\\TestData.xls");
		
		wb = Workbook.getWorkbook(fis);
		
		sh = wb.getSheet(1);
		
		numrow = sh.getRows();
		
		Object [][] FormData = new Object [numrow][sh.getColumns()];

		for(int i=0; i<numrow; i++) {
			
			FormData [i][0] = sh.getCell(0,i).getContents(); 
			FormData [i][1] = sh.getCell(1,i).getContents(); 
			FormData [i][2] = sh.getCell(2,i).getContents(); 			
		}
		
			return FormData;
	}
	
	@AfterTest
	public void  QuitBrowser()
	{
		driver.quit();
	}
	
}
