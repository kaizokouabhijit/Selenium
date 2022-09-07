package assertionsusingtestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	SoftAssert softassert = new SoftAssert();
	
	@Test
	
	public void hardAssertion() {
		Assert.assertEquals("Same", "Same");
		System.out.println("This line will be executed");
		
		Assert.assertNull("softassert");
		System.out.println("This line won't be executed");
	}
	
	@Test
	
	public void softAssertion() {
		softassert.assertNull("assertion");
		
		System.out.println("WE are using softassert, so this line will execute even though the test case fails");
		softassert.assertAll();
	}
	

}
