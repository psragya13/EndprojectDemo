import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class googlehomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	System.setProperty("webdriver.chrome.driver","C://Users//prachi.sharma1//Downloads//chromedriver_win32//chromedriver.exe");
	  WebDriver driver= new ChromeDriver(); 
	    driver.get("https://www.saucedemo.com/");
	    System.out.println("hello");
}
}
