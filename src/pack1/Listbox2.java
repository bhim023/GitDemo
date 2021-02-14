package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='signup-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname_input']")).sendKeys("bhim");
		
		driver.findElement(By.xpath("//input[@id='lastname_input']")).sendKeys("patil");
		
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		
		WebElement rv = driver.findElement(By.xpath("//select[@id='day']"));
		 
		Select s=new Select(rv);
		
		s.selectByIndex(25);
		
		WebElement rv1 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(rv1);
		
		s1.selectByValue("Aug");		
		
		WebElement rv2 = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2=new Select (rv2);
		
		s2.selectByVisibleText("1988");	
		
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();

	}

}
