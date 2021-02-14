package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream data=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		XSSFWorkbook exl=new XSSFWorkbook(data);
		
		int numberofsheet = exl.getNumberOfSheets();
		
		//get the specific sheet by iterating
		
		for(int i=0; i<=numberofsheet-1; i++)
		{
			if(exl.getSheetName(i).equalsIgnoreCase("testdata"))
			{
			XSSFSheet sheet = exl.getSheetAt(i);
			
		//get the specific row 	
			
			Iterator<Row> rows = sheet.rowIterator();// sheet with collection of row
			
			Row firstrow = rows.next();
			
		//get specific cell by iterating	
			Iterator<Cell> cel = firstrow.cellIterator(); //row with collection of cell
			int k=0;
			int column=0;
			while(cel.hasNext())
			{
		// get specific column
				Cell value = cel.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
				{
					column=k;
				}
				k++;
			}
			
			System.out.println(column);
			
			}
		}
		

	}

}
