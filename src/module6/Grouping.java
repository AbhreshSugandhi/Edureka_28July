package module6;
import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups="HomePage", priority = 0)
	public void TC1()
	{
	System.out.println("HomePageTest1");
	}
	
	@Test(groups="ContactUs", priority = 10)
	public void TC2()
	{
	System.out.println("ContactUs1");
	}

	@Test(groups="ContactUs", priority = 11)
	public void TC3()
	{
	System.out.println("ContactUs2");
	}	
	
	@Test(groups = "Services", priority = 21)
	public void TC4()
	{
	System.out.println("ServicesPageTest2");
	}
	
	@Test(groups="Services", priority = 22)
	public void TC5()
	{
	System.out.println("Services1");
	}
	
	@Test(groups="ContactUs", priority = 12)
	public void TC6()
	{
	System.out.println("ContactUs3");
	}
	
	@Test(groups="HomePage",  priority = 2)
	public void TC7()
	{
	System.out.println("HomePageTest3");
	}
	
	@Test(groups="Services", priority = 24)
	public void TC8()
	{
	System.out.println("Services2");
	}	
	
	@Test(groups="HomePage", priority = 5)
	public void TC9()
	{
	System.out.println("HomePageTest4");
	}
}