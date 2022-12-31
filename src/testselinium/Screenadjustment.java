package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenadjustment {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
       // driver.close();
        
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        
        
        
		


	}

}
