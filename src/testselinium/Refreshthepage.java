package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Refreshthepage {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//js.executeScript("document.getElementById('firstname').value='testing'");
		//WebElement x=driver.findElement(By.xpath("//input[@type='checkbox']"));
		//js.executeScript("agruments[0].click();", x);
		
		
		js.executeScript("document.getElementById('firstName').value='testing'");
		WebElement x= driver.findElement(By.xpath("//input[@type='checkbox']"));
		js.executeScript("arguments[0].click();", x);
		js.executeScript("location.reload();");

	}

}
