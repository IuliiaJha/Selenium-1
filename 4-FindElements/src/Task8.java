import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().fullscreen();
		chromeDriver.get("https://abcnews.go.com/");
		
		//get the box
		WebElement box = chromeDriver.findElement(By.xpath("//*[@id='main-container']/div/div/article[2]/ul"));
		
		//get the list items
		List<WebElement> links = box.findElements(By.tagName("li"));
		int linkSize=links.size();

		for(int i=1;i<linkSize;i++) {
			chromeDriver.findElement(By.xpath("//*[@id='main-container']/div/div/article[2]/ul/li["+i+"]//div/h1/a")).click();
			System.out.println(chromeDriver.getTitle());
			chromeDriver.navigate().back();
		}
		
	

	}

}
