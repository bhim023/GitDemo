package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listboxhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement rv = driver.findElement(By.xpath("//input[@id='email']"));
		rv.sendKeys("bhim.patil023@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pintu");
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		
		
		
		

	}

}
