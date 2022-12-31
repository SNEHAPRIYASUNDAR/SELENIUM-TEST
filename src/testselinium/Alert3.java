package testselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert3 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Selenium Testing");
		driver.switchTo().alert().accept();
		
	
		driver.switchTo().alert().dismiss();		
	}

}
