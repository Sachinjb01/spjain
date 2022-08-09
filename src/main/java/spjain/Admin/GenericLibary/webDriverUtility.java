package spjain.Admin.GenericLibary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class webDriverUtility {
	
	
//this method wait for 20 sec per page load
	
	public void waitUntilPageLod(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}

}
