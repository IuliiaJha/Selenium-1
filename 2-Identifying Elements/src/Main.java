import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//id locator
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Mike");
		
		//name locator
		driver.findElement(By.name("passwd")).sendKeys("abc123");
		
		//linkText locator
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.navigate().back();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("new account")).click();
		
		
		
	}

}
