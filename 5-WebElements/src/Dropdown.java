import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.priceline.com/");
		
		//Select
//		WebElement dropDown = driver.findElement(By.name("rooms"));
//		Select s = new Select(dropDown);
		
//		Select s = new Select(driver.findElement(By.name("rooms")));
		
//		s.selectByIndex(2);
//		s.selectByValue("7");
//		s.deselectByVisibleText("9 Rooms");
		
		//Print everything from the list
//		List<WebElement> options = s.getOptions();
//		System.out.println("Total Elements: " + options.size());
		
		//Select Multiple
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement dropDown = driver.findElement(By.id("selenium_commands"));
		Select s=new Select(dropDown);
		
		s.selectByIndex(0);
		s.selectByIndex(3);
		List<WebElement> allSelected=s.getAllSelectedOptions();
		allSelected.size();
		for(WebElement e:allSelected) {
			System.out.println(e.getText());
		}
		
		
		
		
		
		

	}

}
