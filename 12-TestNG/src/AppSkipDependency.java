import org.testng.SkipException;
import org.testng.annotations.Test;

public class AppSkipDependency {

	@Test(priority=1)
	public void LoginTest() {
		//webdriver
		System.out.println("Login");
		throw new SkipException("Reason");
	}
	
	@Test(priority=2,dependsOnMethods= {"LoginTest"})
	public void PasswordChangeTest() {
		//webdriver
		System.out.println("Changing Passsword");
	}
	
	@Test(priority=3,dependsOnMethods= {"LoginTest","PasswordChangeTest"})
	public void LogoutTest() {
		System.out.println("Logout");
	}
}
