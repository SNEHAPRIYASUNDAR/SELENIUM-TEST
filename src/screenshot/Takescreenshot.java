package screenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Takescreenshot
{
	
	static WebDriver driver;

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");
		screenShot("application");
		driver.findElement(By.id("firstName")).sendKeys("Automation");
		screenShot("firstName");
		driver.findElement(By.id("lastName")).sendKeys("Testing");
		screenShot("lastName");
	}
	
	public static void screenShot(String fileName)throws Exception
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
		File des =new File("./ScreenShot/"+fileName+".png");
		FileUtils.copyFile(src, des);
	}
	

}
