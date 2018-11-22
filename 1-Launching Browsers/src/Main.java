import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.amazon.com/");
		
		System.setProperty("webdriver.gecko.driver","/Users/orcuncanlilar/Selenium/geckodriver");
		FirefoxDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.amazon.com/");
		

	}

}
