package Tesla;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {
	
	  static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		//comment
		
		 driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		takeScreenshot("Facebook_LoginPage");

	}

	
	
	    public static void takeScreenshot(String fileName) throws IOException {
	    	
	    	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	
	    	FileUtils.copyFile(file, new File("C:\\Users\\DELL\\Desktop\\santu"+fileName+".jpg"));
	    	
	    }
	    
	    	
	    	
	    }


