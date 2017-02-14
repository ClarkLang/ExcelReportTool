package versionone.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.write.*;
import versionone.bean.ColourBean;
import versionone.utils.ExcelGeneratorUtils;

public class UI {

    public UI()
    {

    }	
	
	public static void GenerateVersionOneScheduleReport() throws Exception
	{
		WritableWorkbook book = null;
		
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dataStr = "VersionOneReport " + sdf.format(date);
		System.out.println(dataStr);
		book = Workbook.createWorkbook(new File("c:/cdp/" + dataStr +".xls"));
		
        WritableSheet sheet = book.createSheet("name", 0);
        Label label = new Label(0, 0, "clark");
        sheet.addCell(label);
        
        WritableCellFormat greyBackground = new WritableCellFormat();
        ColourBean colour = new ColourBean();
        greyBackground.setBackground(colour.getTaskColour());
        
        jxl.write.Number number = new jxl.write.Number(1, 0, 30, greyBackground);
        sheet.addCell(number);
        
        ExcelGeneratorUtils test = new ExcelGeneratorUtils();
        test.exportExcel(book);
	}
}
