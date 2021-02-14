package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("samsung");
		
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/input[1]")).click();

	}

}
