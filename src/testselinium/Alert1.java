package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Alert1 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.driver.chrome", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
