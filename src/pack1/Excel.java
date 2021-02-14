package pack1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		
		FileInputStream File=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		Object Value = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(Value);
		
		

	}

}
