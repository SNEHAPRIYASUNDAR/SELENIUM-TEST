package practiceselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Testregistrationform {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Shriram");
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@abc.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		
		//driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		driver.findElement(By.xpath("//a[text()='Bulgarian']")).click();
		
		Select skill_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		skill_Dropdown.selectByIndex(4);
		
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Denmark");
		driver.findElement(By.xpath("//li[text()='Denmark']")).click();
		
		
		Select year_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		year_Dropdown.selectByValue("2000");
		
		Select month_Dropdown=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		month_Dropdown.selectByValue("March");
		
		Select day_Dropdown=new Select(driver.findElement(By.xpath("//select[@ng-model='daybox']")));
		day_Dropdown.selectByValue("21");
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123");

		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123");

		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		driver.findElement(By.xpath("//button[@id='Button1']")).click();
		
	}

}
