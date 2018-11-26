import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.etsy.com/");
		
		List<WebElement> links = chromeDriver.findElements(By.tagName("span"));
		
		for(WebElement element: links) {
			if(element.getText().equals("Clothing & Shoes")) {
				element.click();
			}
		}
		

	}

}
