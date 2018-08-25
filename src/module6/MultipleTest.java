package module6;

import org.testng.annotations.Test;

public class MultipleTest {

	@Test(priority = 0)
	public void Car() {
		System.out.println("OpenURL");
	}
	
	@Test(priority = 3)
	public void Bike() {
		System.out.println("Perform Login");
	}
	
	@Test(priority = 1, dependsOnMethods = "Bike", enabled = false)
	public void Truck() {
		System.out.println("perfrom Logout");
	}
	
	@Test(priority = 2, enabled = true)
	public void Train() {
		System.out.println("OpenanotherURL");
	}
}
