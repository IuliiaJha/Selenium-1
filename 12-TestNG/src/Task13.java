import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task13 {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}
	
	@Test(dataProvider="getData")
	public void login(String username,String password) {
		
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		Assert.assertTrue(isElementPresent("passCount"));
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		
	}
	
	@DataProvider
	public Object[][] getData(){
	
	Object[][] data = new Object[2][2];
	
	//first row
	data[0][0]="tutorial";
	data[0][1]="tutorial";

	
	//second row
	data[1][0]="username";
	data[1][1]="password";
	

	
	

	
	return data;
	}

	public boolean isElementPresent(String string) {
		
		if(driver.findElement(By.name(string)).isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}


