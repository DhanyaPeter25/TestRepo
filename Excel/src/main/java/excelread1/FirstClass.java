package excelread1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstClass
{
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\admin\\Desktop\\Demo.xlsx");//to get details from a file
		wb= new XSSFWorkbook(f);//to get details from workbook
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}
	public static String getInteger(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\admin\\Desktop\\Demo.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int x=(int)c.getNumericCellValue();
		return String.valueOf(x);//typecasting
	}
	public static String getFloat(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\admin\\Desktop\\Demo.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");
		XSSFRow r =sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float x=(float)c.getNumericCellValue();
		return String.valueOf(x);//typecasting
	}
}
