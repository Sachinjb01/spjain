package adminportal;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdashbord {

	
	WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\r\n");
		 driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void Signin() throws Throwable {
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//span[.='Sign In']")).click();
	     
		
	}
	
	@Test
	public void drawer() throws Throwable {
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root jss175']")).click();
		
	}
	
	
	@Test
	public void ExamManagement()
	{
		   driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	}
	
	@Test
	public void dashbord() {

	     driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
		
	}
	
	@Test
	public void questionpaper() {
		driver.findElement(By.xpath("(//span[.='Qstn Paper'])[1]")).click();
		
	}
	
	@Test
	public void seatplan() {
		 driver.findElement(By.xpath("(//span[.='Seat Plan'])[1]")).click();
	}
	
	@Test
	public void Dashbordagin() {
		
		  driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
	}
	
	@Test
	public void Invigilation() {
		 driver.findElement(By.xpath("(//span[.='Invigilation'])[1]")).click();
	}
	
	
	@Test
	public void dashbordtab() {
		
		 driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
		
	}
	
	@Test
	public void listbox() {
	    driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]")).click();

		
	}
	@Test
	public void listboxdropdown() {
		
	    driver.findElement(By.xpath("//li[.='15 Days']")).click();

		
	}
	
	@Test
	public void viewall() {
	    driver.findElement(By.xpath("(//span[.='View All'])[1]")).click();

	}
	
	@Test
	public void Evaluation() {
	    driver.findElement(By.xpath("(//span[.='Evaluation'])[1]")).click();

	}
	
	@Test
	public void dashbordoncemore()
	{
	    driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();

	}
	
	@Test
	public void listbox1() {
		
	    driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]")).click();

		
	}
	
	@Test
	public void dropdown()
	{
	    driver.findElement(By.xpath("//li[.='15 Days']")).click();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,2000)");

	}
	
	@Test
	public void viewalll() {
		driver.findElement(By.xpath("(//span[.='View All'])[2]")).click();
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
