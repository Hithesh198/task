package task;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DisplayColumns {

	public static void main(String[] args) {
		try  
		{  
		File file = new File("C:\\Users\\Admin\\Downloads\\DataOfEmployee1.xlsx");
		FileInputStream fis = new FileInputStream(file);  
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(0);     
		Iterator<Row> itr = sheet.iterator();   
		while (itr.hasNext())                 
		{  
		Row row = itr.next();  
		Iterator<Cell> cellIterator = row.cellIterator(); 
		int i=0;
		
		while (cellIterator.hasNext())   
		{  
			
		Cell cell = cellIterator.next();
		 Cell currentcellIndex = cell;
		
		System.out.print( cell.getSheet().getRow(i+1).getCell(0).toString());
	i++;
		//System.out.println(cell.getRowIndex());
		 break;
		 
		}	  
		
		
		System.out.println();    
		}   
		wb.close();
} 
		catch(Exception e) {
		e.printStackTrace(); 
}
	}

}
