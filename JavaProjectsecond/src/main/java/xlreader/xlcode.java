package xlreader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlcode {
	static FileInputStream f;// file from a given path
	static XSSFWorkbook w;//to make changes in a workbook (predefined class)
	static XSSFSheet sh;//
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\hp\\Desktop\\Book1.xlsx");
		w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return(c.getStringCellValue());
	}
	public static String getTntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\hp\\Desktop\\Book1.xlsx");
		w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();//typecast
		return String.valueOf(x);
		
	}
}
