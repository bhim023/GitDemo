package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugession {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("samsung");
		
		Thread.sleep(3000);
		
		List<WebElement> rv = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		Thread.sleep(2000);
		
		String exp="samsung m51";
		
		for(int i=0; i<=rv.size()-1; i++)
		{
						
			String act = rv.get(i).getText();
			
			if(act.equalsIgnoreCase(exp))
			{
				rv.get(i).click();
			}
		}

	}

}
