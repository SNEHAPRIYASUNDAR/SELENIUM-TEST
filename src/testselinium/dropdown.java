package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sneha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("priya");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("viruthunagar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ijk@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("987456321");
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).clear();
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		//driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		Select dropdownSkill=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		//dropdownSkill.selectByIndex(4);
		dropdownSkill.selectByValue("Corel Draw");
		//dropdownSkill.selectByVisibleText("Certifications");
				
	
	}

}
