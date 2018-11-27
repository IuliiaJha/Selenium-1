import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons");
		
		List<WebElement> allRadios = driver.findElements(By.name("citizenship"));
		System.out.println(allRadios.size());
		allRadios.get(1).click();
		System.out.println(allRadios.get(0).isSelected());
		
	}

}
