package pack3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='familyandfriend']")).isSelected());
		
		driver.findElement(By.xpath("//div[@id='familyandfriend']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='familyandfriend']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='familyandfriend']")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
