package pack1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://touch.facebook.com/");
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(source);
	
	File dest=new File("C:\\Users\\v-bhipat\\Desktop\\Selen\\screenshot\\screen1.png");
	
	FileUtils.copyFile(source, dest);
	
	

	}
	
}
