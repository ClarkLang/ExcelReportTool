package versionone.utils;

import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.*;

public class ExcelGeneratorUtils {

	/**
	 * Method to read excel(Members.xls or Backlog.xls) and get the data, return cell
	 * 
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public Sheet readExcel(String path) throws Exception 
	{
		//c:/cdp/Members test.xls
        FileInputStream fis = new FileInputStream(path);   
        jxl.Workbook rwb = Workbook.getWorkbook(fis);   
        Sheet[] sheet = rwb.getSheets();  
        Sheet sheetData = sheet[0];
        Cell cell = null;
        int rsColumns = sheet[0].getColumns();   
        int rsRows = sheet[0].getRows();   
        for (int i = 0; i < rsRows; i++)   
        {   
            for (int j = 0; j < rsColumns; j++)   

            {   
                cell = sheet[0].getCell(j, i);   
//                System.out.print(" " + j + "-" + i + " ");  
//                System.out.print(cell.getContents() + " ");   
            }   
        }
        return sheetData;
	}
	
	/**
	 * Method to export Excel
	 * 
	 * @param book
	 * @throws Exception
	 */
	public static void exportExcel(WritableWorkbook book) throws Exception
	{
        book.write();
        book.close();
	}

}
