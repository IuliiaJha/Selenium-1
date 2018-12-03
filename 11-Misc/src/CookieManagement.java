import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManagement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cnn.com/");

		Set<Cookie> cookie = driver.manage().getCookies();
		
		for(Cookie ck:cookie) {
			System.out.println(ck.getName() + " " +ck.getValue());
		}
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("s_ppv 19");
		
		
	}

}
