import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		//get()
		chromeDriver.get("https://www.amazon.com/");
		chromeDriver.get("https://www.google.com/");
		
		//navigate()
		chromeDriver.navigate().back();
		chromeDriver.navigate().forward();
		chromeDriver.navigate().refresh();
		chromeDriver.navigate().to("https://www.amazon.com/");
		
		//getTitle()
		String title=chromeDriver.getTitle();
		System.out.println(title);
		
		//getCurrentURL()
		String url=chromeDriver.getCurrentUrl();
		System.out.println(url);
		
		//close
		chromeDriver.close();

	}

}
