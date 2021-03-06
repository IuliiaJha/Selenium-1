import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.rules.ErrorCollector;

public class Assertion {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void testApp() {
		
		
//		System.out.println("A");
//		Assert.assertEquals("Hello","Hello123");
//		Assert.assertTrue(3>1);
//		System.out.println("B");
		
		System.out.println("A");
		try {
			Assert.assertEquals("Hello","Hello123");
		}catch(Throwable t) {
			errCol.addError(t);
			System.out.println("Error");
		}
		
		System.out.println("B");
	
		try {
		Assert.assertTrue("Link not present",false);
		}catch(Throwable t) {
			errCol.addError(t);
		}
	}

}
