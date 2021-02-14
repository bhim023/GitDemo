package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		int number = book.getNumberOfSheets();
		
		//get specific sheet
		
		for(int i=0; i<number; i++)
		{
			if(book.getSheetName(i).equalsIgnoreCase("testdata"))
			{
			XSSFSheet sheet = book.getSheetAt(i);
			
			//get specific row
			
			Iterator<Row> rows = sheet.rowIterator();
			
			rows.next();
			Row second = rows.next();
			
			//get specific cell
			
			Iterator<Cell> cel = second.cellIterator();
			int k=0;
			int column=0;
			while(cel.hasNext())
			{
				Cell value = cel.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
				{
					column=k;
				}
				k++;
			}
			
			System.out.println(column);
			
			while(rows.hasNext())
			{
				Row rel = rows.next();
				if(rel.getCell(column).getStringCellValue().equalsIgnoreCase("purchage"))
				{
					Iterator<Cell> c = rel.cellIterator();
					while(c.hasNext())
					{
					System.out.println(c.next().getStringCellValue());
					}
				}
			}
			}
		}
		
		
		

	}

}
