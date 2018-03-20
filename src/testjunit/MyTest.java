package testjunit;

//import static org.junit.Assert.*;

//import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {

	
	
	WebDriver driver=null;
	@Test
	public void test(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse neon\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		System.out.println("Site open");
		//driver.quit();
		System.out.println("Test End");
	}

}
