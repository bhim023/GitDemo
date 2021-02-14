package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		//int numb = driver.findElements(By.tagName("iframe")).size();
		
		//System.out.println(numb);
		
		//driver.switchTo().frame(1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='u_2_b']")).sendKeys("bhim");
		
		driver.findElement(By.xpath("//input[@id='u_2_d']")).sendKeys("patil");
		
		driver.findElement(By.xpath("//input[@id='u_2_g']")).sendKeys("978899");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("bhim023");
		
		WebElement rv1 = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(rv1);
		
		s.selectByIndex(26);
		
		
		

	}

}
