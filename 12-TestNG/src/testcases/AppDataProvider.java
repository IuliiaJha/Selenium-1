package testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AppDataProvider {
	
	@Ignore
	@Test(dataProvider="getData")
	public void LoginTest(String username,String password,String phone,String browser) {
		
		System.out.println(username + "|" + password + "|" + phone + "|" + browser);
		
	}
	
	@Test(dataProvider="getData2")
	public void LoginTest2(String username) {
		System.out.println(username);
	}
	
	@DataProvider
	public String[] getData2(){
	
	String[] data = new String[3];
	data[0]="apple";
	data[1]="banana";
	data[2]="orange";
	
	
	return data;
	}
	
	
	
	
	@DataProvider
	public Object[][] getData(){
	
	Object[][] data = new Object[3][4];
	
	//first row
	data[0][0]="username-1";
	data[0][1]="password-1";
	data[0][2]="phone-1";
	data[0][3]="browser-1";
	
	//second row
	data[1][0]="username-2";
	data[1][1]="password-2";
	data[1][2]="phone-2";
	data[1][3]="browser-2";
	
	//third row
	data[2][0]="username-3";
	data[2][1]="password-3";
	data[2][2]="phone-3";
	data[2][3]="browser-3";
	
	return data;
	}
	
	

}
