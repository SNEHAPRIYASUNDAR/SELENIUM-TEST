package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation Testing");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		
		driver.switchTo().defaultContent();   //main html
		
		
		driver.findElement(By.xpath("//a[@href='#Single']")).click();
		
	}

}
