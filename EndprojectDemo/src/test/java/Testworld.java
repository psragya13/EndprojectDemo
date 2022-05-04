import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testworld {

	@Test
	public void google() {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C://Users//prachi.sharma1//Downloads//chromedriver_win32//chromedriver.exe");
		  WebDriver driver= new ChromeDriver(); 
		    driver.get("https://www.saucedemo.com/");
		    
	}
}


