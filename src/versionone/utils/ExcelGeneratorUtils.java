package versionone.utils;

import java.io.File;
import java.io.IOException;
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
 

	}
	
	public static void exportExcel(WritableWorkbook book) throws Exception
	{
		


        book.write();
        book.close();
	}

}
