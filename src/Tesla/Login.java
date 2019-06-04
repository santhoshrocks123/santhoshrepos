package Tesla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException  {
	
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.facebook.com/");
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("username");
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("password");
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//input[@value and @data-testid]")).click();
     
          

	 
	} 
}                                            