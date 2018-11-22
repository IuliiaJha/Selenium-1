import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicBrowser {

	public static void main(String[] args) {
		
//		String browser = "Chrome";
		
//		if(browser.equals("Chrome")) {
//			System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
//			ChromeDriver chromeDriver = new ChromeDriver();
//			chromeDriver.get("https://www.amazon.com/");
//			//click
//		}else if(browser.equals("Firefox")) {
//			System.setProperty("webdriver.gecko.driver","/Users/orcuncanlilar/Selenium/geckodriver");
//			FirefoxDriver firefoxDriver = new FirefoxDriver();
//			firefoxDriver.get("https://www.amazon.com/");
//			//click
//		}else if(browser.equals("IE")) {
//			//get
//			//click
//		}
		
		String browser = "Chrome";
		WebDriver driver = null;
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/orcuncanlilar/Selenium/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.com/");
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
