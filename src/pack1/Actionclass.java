package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		WebElement a = driver.findElement(By.xpath("//div[@class='_6ltg'][2]"));
		
		Actions b=new Actions(driver);
		
		b.moveToElement(a).click().perform();

	}

}
