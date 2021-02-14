package functionaltesting_9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Links from all over the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//links from footer of the page
		
		WebElement footerdriver = driver.findElement(By.cssSelector("div#gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//links form one of coloumn of footer of the page
		
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
		
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//open all links in different tab on the same page
		
		for (int i=1; i<=coloumndriver.findElements(By.tagName("a")).size(); i++)
		{
			String controlclick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(controlclick);
		}
		
		//get the title of the each page
		
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
