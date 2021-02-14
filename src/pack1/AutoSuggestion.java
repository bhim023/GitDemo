package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi 9");
		
		Thread.sleep(5000);
		
		List<WebElement> lis = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		int siz = lis.size();
		
		System.out.println(siz);
		
		String exp = "redmi 9i";
		for(int i=0; i<=siz-1; i++)
		{
			String act= lis.get(i).getText();
			if(act.equalsIgnoreCase(exp))
			{
				lis.get(i).click();
			}
		}
		

	}

}
