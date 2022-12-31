package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Togettitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		System.out.println(driver.getTitle());
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
	}

}
