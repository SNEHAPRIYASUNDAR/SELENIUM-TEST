package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondraganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions action=new Actions(driver);
		
		WebElement src=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des=driver.findElement(By.id("bank"));
		
		action.dragAndDrop(src, des).build().perform();
		
		WebElement src1=driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement des1=driver.findElement(By.id("amt7"));
		
		action.dragAndDrop(src1, des1).build().perform();
		
		WebElement src2=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des2=driver.findElement(By.id("loan"));
		
		action.dragAndDrop(src2,des2).build().perform();
		
		WebElement src3=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement des3=driver.findElement(By.id("amt8"));
		
		action.dragAndDrop(src3,des3).build().perform();
		
//	    WebElement src4=driver.findElement(By.xpath("//a[text()=' LOAN ']"));
//		WebElement des4=driver.findElement(By.id("bank"));
		
//		action.dragAndDrop(src4,des4).build().perform();
		
	//	WebElement src5=driver.findElement(By.xpath("//a[text()=' SALES ']"));
	//	WebElement des5=driver.findElement(By.id("loan"));
		
	//	action.dragAndDrop(src5,des5).build().perform();         */
		
	}

}
