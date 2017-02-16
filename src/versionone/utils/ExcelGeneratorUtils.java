package versionone.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.*;

public class ExcelGeneratorUtils {

	public void readExcel() throws Exception 
	{
		
		           FileInputStream fis = new FileInputStream("c:/cdp/test.xls");   
		            StringBuilder sb = new StringBuilder();   
		            jxl.Workbook rwb = Workbook.getWorkbook(fis);   
		            Sheet[] sheet = rwb.getSheets();  

//		jxl.Workbook readwb = null; 
//		
//        InputStream instream = new FileInputStream("test.xls");   
//
//        readwb = Workbook.getWorkbook(instream);   
//
//
//
//
     


        int rsColumns = sheet[0].getColumns();   
  

        int rsRows = sheet[0].getRows();   



        for (int i = 0; i < rsRows; i++)   

        {   

            for (int j = 0; j < rsColumns; j++)   

            {   

                Cell cell = sheet[0].getCell(j, i);   

                System.out.print(cell.getContents() + " ");   

            }   

            System.out.println();   
        }


	}
	
	public static void exportExcel(WritableWorkbook book) throws Exception
	{
		


        book.write();
        book.close();
	}

}
