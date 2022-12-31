package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementchecking {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sneha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("priya");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("viruthunagar");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ijk@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9874563621");
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).clear();
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		//driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123");

		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		//driver.findElement(By.xpath("//button[@id='Button1']")).click();
		
		
		
				
	}

}
