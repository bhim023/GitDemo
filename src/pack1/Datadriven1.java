package pack1;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\v-bhipat\\Desktop\\Selen\\exx.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		int num = workbook.getNumberOfSheets();
	//get the specific sheet	
		for(int i=0; i<num; i++)
		{
						
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
	//get the specific row
				
				Iterator<Row> rows = sheet.rowIterator();
				
				Row firstrow = rows.next();
				
	//get specific cell
				
				Iterator<Cell> cel = firstrow.cellIterator();
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
			}
		}

	}

}
