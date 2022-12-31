package practiceselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class flipcartname {

	public static void main(String[] args) {
		//System.setProperty("webdriver.drivers.chrome", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(" html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input").sendKeys("Testing"));
		
	}

}
