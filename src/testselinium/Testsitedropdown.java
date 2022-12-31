package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Testsitedropdown {

	public static void main(String[] args) {
	WebDriver driver;
	driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	Select skill_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	skill_Dropdown.selectByIndex(4);
	
	Select year_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
			year_Dropdown.selectByValue("1996");
			
			Select month_Dropdown=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
			month_Dropdown.selectByValue("February");
			
			Select day_Dropdown=new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
			day_Dropdown.selectByValue("7");
			
			
			//Select month_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='daybox']]")));
					//month_Dropdown.selectByVisibleText("7");
					
					driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
					
					driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("india");
					
					driver.findElement(By.xpath("//li[text()='India']")).click();
					
					
					driver.findElement(By.xpath("//div[@id='msdd']")).click();
					driver.findElement(By.xpath("//a[text()='Arabic']")).click();
					driver.findElement(By.xpath("//a[text()='Bulgarian']")).click();
			
			
			
	};

}
