package pack1;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream file1=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		String Id = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Id);
		
		FileInputStream file2=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		String pass = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
				
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		

	}

}
