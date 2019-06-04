package Tesla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.xpath("")).sendKeys("");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("")).sendKeys("");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("")).click();
		
		driver.close();

	}

}
