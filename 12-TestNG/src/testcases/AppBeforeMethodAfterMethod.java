package testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppBeforeMethodAfterMethod {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---Before Method---");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("---After Method---");
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
	}
	
	@Test(priority=3)
	public void LogoutTest() {
		System.out.println("Logout");
	}

}
