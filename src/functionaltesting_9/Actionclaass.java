package functionaltesting_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclaass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//WebElement rv = driver.findElement(By.cssSelector("a#nav-link-accountList"));
		
		Actions a=new Actions(driver);
		
		//a.moveToElement(rv).build().perform();
		
		//WebElement rv1 = driver.findElement(By.cssSelector("a#nav_prefetch_yourorders span.nav-text"));
		
		//Thread.sleep(3000);
		
		//a.moveToElement(rv1).click().build().perform();
		
		WebElement rv2 = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
						
		a.moveToElement(rv2).click();

	}

}
