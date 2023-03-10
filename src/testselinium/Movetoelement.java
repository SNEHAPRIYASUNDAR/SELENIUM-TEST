package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		Actions action=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		action.moveToElement(src).build().perform();
		
	}

}
