package xlreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode {
	static FileInputStream f;//to access the file from a given path
	static XSSFWorkbook w;//to make changes/to access  a workbook from the file (predefined class)
	static XSSFSheet sh;//to access the particular  sheet from the workbook
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\hp\\Desktop\\Book1.xlsx");
		w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(a);//xssfrow class to do modification in row
		XSSFCell c=r.getCell(b);//xssfcell class to do modification in cell
		return(c.getStringCellValue());// to retrieve string value from a cell
	}
	public static String getTntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\hp\\Desktop\\Book1.xlsx");
		w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();//typecast to convert string to integer
		return String.valueOf(x);
		
	}
}
