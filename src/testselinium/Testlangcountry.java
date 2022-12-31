package testselinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testlangcountry {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.drivers.chrome","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//driver.findElement(By.id("msdd")).click();
		//driver.findElement(By.xpath("//a[text()='Danish']")).click();
		//driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.className("select2-search__field")).sendKeys("India");
		driver.findElement(By.xpath("//li[text()='India']")).click();
		

}
}