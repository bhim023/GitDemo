package pom1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String data(int a, int b) throws Exception
	{
		FileInputStream data=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		String data1 = WorkbookFactory.create(data).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
		
		return data1;
		
	}

}
