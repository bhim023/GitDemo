package pack3;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		String rv = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(rv);

	}

}
