import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		//IMPLICIT WAIT
		
//		chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		chromeDriver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
//		chromeDriver.findElement(By.id("H-destination")).sendKeys("nyc");
//		chromeDriver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
//		chromeDriver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
//		chromeDriver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels')]")).click();
		
		//EXPLICIT WAIT
		
		WebDriverWait wait = new WebDriverWait(chromeDriver, 5);
				
		chromeDriver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		chromeDriver.findElement(By.id("H-destination")).sendKeys("nyc");
		chromeDriver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		chromeDriver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels')]")));
		chromeDriver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels')]")).click();
		
		
		
		
		
		

		
		
		
		
		
		
		
		

	}

}
