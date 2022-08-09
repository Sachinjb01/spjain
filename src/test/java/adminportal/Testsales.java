package adminportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsales {
	
	public static WebDriver driver;
	@Test
	public void login() {
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}
		
	}





