package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {
	XSSFSheet sheet;
	Excelfile() throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Nikhil\\Downloads\\MavenExcelFile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		sheet=workbook.getSheet("Sheet1");
		
	}
	public String readData(int i,int j)
	{
		Row row=sheet.getRow(i);
		Cell cell=row.getCell(i);
		return cell.getStringCellValue();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excelfile ae=new Excelfile();
		String value=ae.readData(0, 0);
		System.out.println(value);
	}

}
