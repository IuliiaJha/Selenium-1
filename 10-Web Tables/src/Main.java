
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ozzy\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//will give the all names
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		//will give the all currentPrices
		List<WebElement> currentPrice = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		
		System.out.println("Total names " + names.size());
		System.out.println("Total prices " + currentPrice.size());
		
		String str = "Biocon";
		for(int i=0;i<names.size();i++) {
			if(names.get(i).getText().equals(str)){
				System.out.println(names.get(i).getText() + "----" + currentPrice.get(i).getText());
				break;
			}
		}
		
		//how many total rows?
		int cols = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("Rows -" + rows);
		System.out.println("Columns - " + cols);

		
		
	}
	}