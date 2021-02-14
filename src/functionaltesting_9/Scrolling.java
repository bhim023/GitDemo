package functionaltesting_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		
		jsc.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(3000);
		
		jsc.executeAsyncScript("document.querySelector(\".tableFixHead\").scrollTop=500");
		
		Thread.sleep(3000);
		
		List<WebElement> lis = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0; i<lis.size(); i++)
		{
			sum=sum + Integer.parseInt(lis.get(i).getText());
		}
		
		System.out.println(sum);

	}

}
