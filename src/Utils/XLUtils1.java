package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils1 
{
	
	public static FileInputStream fi;
	public static Workbook wb;
	public static Sheet ws;
	public static Row r;
	public static Cell c;
	public static FileOutputStream fo;
	public static CellStyle style;
	
	
	public static int getRowcount(String xlfile,String xlsheet) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;	
	}
	public static short getcolumncount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
       short columncount=r.getLastCellNum();
       wb.close();
       fi.close();
       return columncount;
		
		
	}
    public static String getStringcellData(String xlfile,String xlsheet,int rownum,short colnum) throws IOException

    {
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(xlsheet);
	r=ws.getRow(rownum);
	String data;
	try {
		c=r.getCell(colnum);
		data=c.getStringCellValue();
	}catch(Exception e)
	
	{
	data=" ";
    }
	wb.close();
	fi.close();
	return data;
}
    public static double getNumericcellData(String xlfile,String xlsheet,int rownum,short colnum) throws IOException
    {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	r=ws.getRow(rownum);
    	double data;
    	try {
    		c=r.getCell(colnum);
    		data=c.getNumericCellValue();
    	}catch(Exception e)
    	{
    		data=0;
    	}
    	
    	wb.close();
    	fi.close();
		return data;
    	
    }
    public static boolean getbooleancellData(String xlfile,String xlsheet,int rownum,short colnum) throws IOException
    {
    		fi=new FileInputStream(xlfile);
    		wb=new XSSFWorkbook(fi);
    		ws=wb.getSheet(xlsheet);
    		r=ws.getRow(rownum);
    		boolean data;
    		try {
    			c=r.getCell(colnum);
    			data=c.getBooleanCellValue();
    		}catch(Exception e)
    		{
    			return false;
    		}
    		wb.close();
    		fi.close();
		return data;
    	
    }
    public static void setcellData(String xlfile,String xlsheet,int rownum,short colnum,String data) throws IOException  
    {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	r=ws.getRow(rownum);
    	c=r.createCell(colnum);
    	c.setCellValue(data);
    	fo=new FileOutputStream(xlfile);
    	wb.write(fo);
    	fi.close();
    	fo.close();
   
    }
    public static void fillGreencolor(String xlfile,String xlsheet,int rownum,short colnum) throws IOException
    {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	r=ws.getRow(rownum);
    	c=r.getCell(colnum);
    	style=wb.createCellStyle();
    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	c.setCellStyle(style);
    	fo=new FileOutputStream(xlfile);
    	wb.write(fo);
    	wb.close();
    	fo.close();
    	fi.close();
    	
    	
    	
    	
    }
    public static void fillRedcolor(String xlfile,String xlsheet,int rownum,short colnum) throws IOException 
    {
    	fi=new FileInputStream(xlfile);
    	wb=new XSSFWorkbook(fi);
    	ws=wb.getSheet(xlsheet);
    	r=ws.getRow(rownum);
    	c=r.getCell(colnum);
    	style=wb.createCellStyle();
    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	c.setCellStyle(style);
    	fo=new FileOutputStream(xlfile);
    	wb.write(fo);
    	wb.close();
    	fo.close();
    	fi.close();
    }
    {
    	
    }
    
}
