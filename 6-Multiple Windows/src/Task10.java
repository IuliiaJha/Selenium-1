import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 driver.findElement(By.id("button1")).click();
		 
		 Set<String> w = driver.getWindowHandles();
		 Iterator<String> it = w.iterator();
		 String mainWindow=it.next();
		 String childWindow=it.next();
		 
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 System.out.println(driver.switchTo().window(mainWindow).getTitle());
		 
		 
		 
		 

	}

}
