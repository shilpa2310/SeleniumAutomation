package SeleniumTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExcelData 
{ 
	 
	 public void Readexceldata(String filename , String filepath , String sheetname  , String[] datatowrite) throws IOException 
	 { 
		 String filelocation = filepath+"\\"+filename ;
		 File file = new File (filepath+"\\"+filename) ;
	
		 FileInputStream fin = new FileInputStream(file) ;
		 Workbook wrkbk = null ;
		 String fileext = filename.substring(filename.indexOf(".")) ;
		 
		 if (fileext.equals(".xls"))
		    { 
			 wrkbk = new HSSFWorkbook (fin) ;
			 }
	
		 if (fileext.equals(".xlsX"))
		    {
			 wrkbk = new XSSFWorkbook (fin) ; 
		   }
		 
		 Sheet testsheet =wrkbk.getSheet(sheetname);
		 int rownum = testsheet.getLastRowNum()-testsheet.getFirstRowNum();
		 Row row = testsheet.getRow(0);
		 Row newrow = testsheet.createRow(rownum+1);
		 
		 for (int i = 0 ; i <= row.getLastCellNum(); i++)
		     {
			   Cell cell = newrow.createCell(i) ; 
               cell.setCellValue(datatowrite[i]);
			  }
		 fin.close();	 
		 FileOutputStream fout = new FileOutputStream(file) ;
		 wrkbk.write(fout);
		 
		 fout.close();
	 } 
		 public static  void main (String args[])
		 { {String  valuetowrite[] = {"Shilpa" , "weds" , "harshil"};
		 
		 POIExcelData obj1 = new POIExcelData() ;
		 obj1.Readexceldata("Selenium.xlsx", "C:\\Users\\Harshil\\Downloads" , "Selenium", valuetowrite);
			 
			 
			 
			 
			 
		 } 
		 
		 
		 
		 
		 
		 
		 
		 
		  /*for ( int i = 0 ; i <= rownum ; i++)
		    {
			  Row row = testsheet.getRow(i);
			  { for(int  j= 0 ;j<=testsheet.getLastRowNum();j++)
			     {   Cell cell = row.getCell(i);
			      System.out.println(cell.getStringCellValue()+ " || ");
			     }
			  }
		   
			  public static void main (String args[])
			  {  
				  POIExcelData readtest = new POIExcelData() ;
				  readtest.Readexceldata(Selenium.xlsx, C:\\Users\\Harshil\\Downloads, );
				  
				  
			  }*/
			     
	 
	 
	 
	 }

}}