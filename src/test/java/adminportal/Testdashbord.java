package adminportal;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdashbord {

	
public static	WebDriver driver;
	
	
	@BeforeClass
	public void setup() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	
		 driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\r\n");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}
	
	
	@Test(priority=1)
	public void Signin() throws Throwable {
		

		driver.findElement(By.xpath("//span[.='Sign In']")).click();
	      
		
	}
	
	@Test(priority=2)
	public void drawer() throws Throwable {
		
		
		
	Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[name()='svg'and@class='MuiSvgIcon-root jss175']")).click();
		
	}
	
	
	@Test(priority=3)
	public void ExamManagement() throws Throwable
	{
		
		
	Thread.sleep(2000);
		   driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	}
	
	@Test(priority=4)
	public void dashbord() throws Throwable {
		
	
	Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
		
	}
	
//	@Test(priority=5)
//	public void questionpaper() throws InterruptedException {
//		
//		
//		
//	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[.='Qstn Paper'])[1]")).click();
//		
//	}
	
//	@Test(priority=6)
//	public void seatplan() throws Throwable {
//		
//	
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//span[.='Seat Plan'])[1]")).click();
//	}
	
//	@Test(priority=7)
//	public void Dashbordagin() throws Throwable {
//		
//		
//		
//	
//		Thread.sleep(2000);
//		
//		  driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
//	}
//	
//	@Test(priority=8)
//	public void Invigilation() throws Throwable {
//		
//		
//	
//		
//		Thread.sleep(2000);
//		 driver.findElement(By.xpath("(//span[.='Invigilation'])[1]")).click();
//	}
//	
	
//	@Test(priority=9)
//	public void dashbordtab() throws Throwable {
//		
//		
//		
//		
//	
//		Thread.sleep(2000);
//		
//		 driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
//		
//	}
	
	


	@Test(priority=5)
	public void listbox() throws Throwable {
		
		
		
	
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]")).click();

		
	}
	@Test(priority=6)
	public void listboxdropdown() throws Throwable {
		
		
		
	
		
	Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//li[.='15 Days']")).click();

		
	}
	
	@Test(priority=7)
	public void viewall() throws Throwable {
		
		
		
	
		
	Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[.='View All'])[1]")).click();

	}
	
	@Test(priority=8)
	public void Evaluation() throws Throwable {
		
		
//		
//		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[.='Evaluation'])[1]")).click();

	}
	
	@Test(priority=9)
	public void dashbordoncemore() throws Throwable
	{
	Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();

	}
	
	@Test(priority=10)
	public void listbox1() throws Throwable {
	Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]")).click();

		
	}
	
	@Test(priority=11)
	public void dropdown() throws Throwable
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='15 Days']")).click();
	  
	}
	
	@Test(priority=12)
	public void viewalll() throws Throwable {
		
		
	Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[3]/button/span[1]")).click();
	}
	
	
	@AfterClass
	public void teardown() throws Throwable {
		
		Thread.sleep(2000);
		driver.quit();
	}
}
