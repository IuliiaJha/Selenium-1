import javax.security.sasl.SaslException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppBeforeSuitAfterSuit {
	
	@BeforeSuite
	public void beforeMethod() {
		System.out.println("---Before Suit---");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("---After Suit---");
	}
	
	@Test(priority=1)
	public void LoginTest() {
		//webdriver
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void PasswordChangeTest() {
		//webdriver
		
		System.out.println("Changing Passsword");
		throw new SkipException("reason");
		
	}
	
	@Test(priority=3,enabled=true)
	public void LogoutTest() {
		System.out.println("Logout");
	}

}
