package adminportal;

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

public class TestEndtoEnd {

	WebDriver driver;

	@BeforeClass
	public void setup() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
Thread.sleep(2000);
		driver.get("https://sp-jain-playground-adminportal.ken42.com/app/admin-management/exam\r\n");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@Test(priority = 1)
	public void Signin() throws Throwable {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Sign In']")).click();

	}

	@Test(priority = 2)
	public void drawer() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M15 15H3v2')]")).click();

	}

	@Test(priority = 3)
	public void ExamManagement() throws Throwable {

		Thread.sleep(000);
		driver.findElement(By.xpath("//span[.='Exam Management']")).click();
	}

	@Test(priority = 4)
	public void dashbord() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();

	}

	@Test(priority = 5)
	public void listbox() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]")).click();

	}

	@Test(priority = 6)
	public void listboxdropdown() throws Throwable {

		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[.='15 Days']")).click();

	}

	@Test(priority = 7)
	public void viewall() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='View All'])[1]")).click();

	}

	@Test(priority = 8)
	public void Evaluation() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Evaluation'])[1]")).click();

	}

	@Test(priority = 9)
	public void dashbordoncemore() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();

	}

	@Test(priority = 10)
	public void listbox1() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]")).click();

	}

	@Test(priority = 11)
	public void dropdownnew() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='15 Days']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div[3]/button/span[1]"))
				.click();

	}

	@Test(priority = 12)
	public void viewalll() throws Throwable {

		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,2000)");
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div[2]/div/div/div[4]/div[1]/div/div/div[1]/div[2]/button/span[1]"))
				.click();
	}

	@Test(priority = 13)
	public void student() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Student Status']")).click();
	}

	@Test(priority = 14)
	public void Input() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.className("MuiInputBase-input")).sendKeys("KEN4201");
	}

	@Test(priority = 15)
	public void Dropdown() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.className("MuiIconButton-label")).click();
	}

	@Test(priority = 16)
	public void dropdown() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")).click();
	}

	@Test(priority = 17)
	public void Add_input() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input']"))
				.sendKeys("Attendance Shorts");
	}

	@Test(priority = 18)
	public void dropdown1() throws Throwable {
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[2]")).click();
	}

	@Test(priority = 19)
	public void filter() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Filter']")).click();
	}

	@Test(priority = 20)
	public void dropdown2() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div")).click();
	}

	@Test(priority = 21)
	public void record_dropdown3() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='Pune']")).click();
	}

	@Test(priority = 22)
	public void dropdown4() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[2]/div/div[2]/div")).click();
	}

	@Test(priority = 23)
	public void Record_dropdown5() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='BEC Term 1 Master']")).click();
	}

	@Test(priority = 24)
	public void dropdown6() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[4]/div/div[2]/div")).click();
	}

	@Test(priority = 25)
	public void BECECO101Macroeconomics() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='BECECO101-Macroeconomics 1']")).click();
	}

	@Test(priority = 26)
	public void dropdown7() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[5]/div/div[2]/div")).click();
	}

	@Test(priority = 27)
	public void Not_eligible_button() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='Not Eligible']")).click();
	}

	@Test(priority = 28)
	public void dropdown8() throws Throwable {
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/button[2]/span[1]/p")).click();
	}

	@Test(priority = 29)
	public void All_data() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='All Data']")).click();
	}

	@AfterClass
	public void teardown() throws Throwable {

		Thread.sleep(2000);
		driver.quit();

	}

}
