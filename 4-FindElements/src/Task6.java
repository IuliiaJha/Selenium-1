import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.cnn.com/");
		
		List<WebElement> links = chromeDriver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		WebElement tenthLink = links.get(9);
		System.out.println(tenthLink.getText());
		
		System.out.println(tenthLink.getLocation().x);
		System.out.println(tenthLink.getLocation().y);
		
		System.out.println("==================");
		
//		tenthLink.click();
		
		//print all the links and show the empty one
//		for(int i=0;i<links.size();i++) {
//			System.out.println(links.get(i).getText());
//		}
		
		//print only visible links
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText() + links.get(i).isDisplayed());
		}
		
		
		
		
		//chromeDriver.quit();

	}

}
