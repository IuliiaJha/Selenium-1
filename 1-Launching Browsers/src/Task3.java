import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rediff.com");
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Business")) {
			System.out.println("It is verified");
		}else {
			System.out.println("It is not verified");
		}
		
		driver.close();
		driver.quit();
		

	}

}
