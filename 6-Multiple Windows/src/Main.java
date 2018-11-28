import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
//		Set<String> s = new HashSet<String>();
//		s.add("toyota");
//		s.add("honda");
//		s.add("ford");
//		s.add("bmw");
//		
//		System.out.println(s.size());
//		
//		//no indexing
//		//s.get(0);
//		
//		Iterator<String> it = s.iterator();
//		System.out.println(it.hasNext());
//		System.out.println(it.hasNext());
//		System.out.println(it.hasNext());
		
		//System.out.println(it.next());
		
		//////////////////////////////////////////////////
		
		 System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		 driver.findElement(By.xpath("//a[text()='Terms']")).click();
		 
		 Set<String> winIds=driver.getWindowHandles();
		 System.out.println("Total Windows-" + winIds.size());
		 
		 Iterator<String> it = winIds.iterator();
		 
		 String mainWindow=it.next();
		 String firstWindow=it.next();
		 
		 driver.switchTo().window(mainWindow);
		 driver.close();
		 
		 
		 
		 
		 
		
		
		
		

	}

}
