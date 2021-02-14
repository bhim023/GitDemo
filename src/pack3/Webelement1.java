package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement rv = driver.findElement(By.xpath("//a[contains(@id, 'u_0_2')]"));
		
		String text = rv.getText();
		
		System.out.println(text);
		
		rv.click();
		
		WebElement rv1 = driver.findElement(By.xpath("//*[text()='Female']"));
		
		boolean result1 = rv1.isDisplayed();
		
		if (result1==true)
		{
			System.out.println("it is displayed");
		}
		else
		{
			System.out.println("it is not displayed");
		}
		
		
		
		
		
		

	}

}
