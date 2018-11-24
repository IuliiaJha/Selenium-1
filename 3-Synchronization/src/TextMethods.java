import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/orcuncanlilar/Selenium/chromedriver");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		
		chromeDriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String text = chromeDriver.findElement(By.cssSelector(".floatL.bold")).getText();
		System.out.println(text); //Pasword
		
		chromeDriver.findElement(By.id("login1")).sendKeys("Mike");
		String text2 = chromeDriver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(text2);
		
		String text3 = chromeDriver.findElement(By.name("proceed")).getAttribute("value");
		System.out.println(text3); //go
		
		

	}

}
