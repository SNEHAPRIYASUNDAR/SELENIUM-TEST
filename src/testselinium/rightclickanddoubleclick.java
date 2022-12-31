package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickanddoubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action=new Actions(driver);
		
		//******we have to any one action at time******//
		
		//WebElement src=driver.findElement(By.xpath("//span[text()='right click me']"));
		//action.contextClick(src).build().perform();
		
		//-------------//
		
		//WebElement src=driver.findElement(By.xpath("//span[text()='right click me']"));
		//WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		
		//action.contextClick(src).click(copy).build().perform();
		
		// -----------------//
		
		WebElement src=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(src).build().perform();
		
		
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		

	}

}
