package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/?lang=en");
		
		driver.manage().window().maximize();
		
		List<WebElement> rv = driver.findElements(By.xpath("//a"));
		int num = rv.size();
		System.out.println(num);
		
		for(int i=0; i<=rv.size()-1; i++)
		{
			String result = rv.get(i).getText();
			
			System.out.println(result);
		}

	}

}
