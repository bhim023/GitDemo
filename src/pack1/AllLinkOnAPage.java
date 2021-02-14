package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkOnAPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> a = driver.findElements(By.xpath("//a"));
		
		int rs = a.size();
		
		System.out.println(rs);
		
		for(int i=0; i<=rs-1; i++)
		{
			String links = a.get(i).getText();
			System.out.println(links);
		}
		
		

	}

}
