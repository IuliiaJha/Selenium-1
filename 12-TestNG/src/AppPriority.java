import org.testng.annotations.Test;

public class AppPriority {
	
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
