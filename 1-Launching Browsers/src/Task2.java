import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.dice.com");
		chromeDriver.get("https://indeed.com");
		chromeDriver.navigate().back();
		System.out.println("Current URL is: " + chromeDriver.getCurrentUrl());
		System.out.println("Current Title is: " + chromeDriver.getTitle());
		chromeDriver.navigate().forward();
		System.out.println("Current URL is: " + chromeDriver.getCurrentUrl());
		System.out.println("Current Title is: " + chromeDriver.getTitle());
		chromeDriver.close();
		chromeDriver.quit();
		
		

	}

}
