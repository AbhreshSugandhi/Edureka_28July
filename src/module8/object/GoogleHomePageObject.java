package module8.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObject {

	public GoogleHomePageObject(WebDriver driver) {
		//there is a pageFactory in selenium which will initialize all the element.
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name="btnG")
	public WebElement btnSearch;
	
}
