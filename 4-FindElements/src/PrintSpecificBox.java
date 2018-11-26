import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSpecificBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get("https://www.cnn.com/");
		
		//get the box
		WebElement box = chromeDriver.findElement(By.cssSelector(".cn.cn-list-hierarchical-xs.cn--idx-2.cn-container_97852B15-AE96-34C2-5A58-37293C2DA8D9"));
		
		//get the list items
		List<WebElement> links = box.findElements(By.tagName("li"));
		
		//Print the total number of link
		System.out.println("Total Links - " + links.size());
		
		//Print the links one by one
//		for(WebElement link:links) {
//			System.out.println(link.getText());
//		}
		
		//click on the link one by one - will give error 
		for(int i=0;i<links.size();i++) {
			WebElement link = links.get(i);
			link.click();
			chromeDriver.navigate().back();
		}
		
		
//		for(int i=0;i<links.size();i++) {
//			box=chromeDriver.findElement(By.cssSelector(".cn.cn-list-hierarchical-xs.cn--idx-2.cn-container_97852B15-AE96-34C2-5A58-37293C2DA8D9"));
//			links=box.findElements(By.tagName("li"));
//			WebElement link = links.get(i);
//			link.click();
//			chromeDriver.navigate().back();
//		}
		
		

	}

}
