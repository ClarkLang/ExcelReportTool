package versionone.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.format.UnderlineStyle;
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
        Label label = new Label(0, 1, "clark");
        sheet.addCell(label);
        
        WritableFont wf_title = new WritableFont(WritableFont.ARIAL, 11, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE,  jxl.format.Colour.BLACK);
        
        WritableCellFormat wcf_title1 = new WritableCellFormat(wf_title);  
        wcf_title1.setBackground(jxl.format.Colour.LIGHT_GREEN);  
        wcf_title1.setAlignment(jxl.format.Alignment.CENTRE); 
        wcf_title1.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN,jxl.format.Colour.BLACK); 
        
        Label labelName = new Label(0, 0, "Username");
        Label labelTile01 = new Label(1, 0, "Title", wcf_title1);
        sheet.addCell(labelName);
        sheet.addCell(labelTile01);
        
        WritableCellFormat greyBackground = new WritableCellFormat();
        ColourBean colour = new ColourBean();
        greyBackground.setBackground(colour.getTaskColour());
        
        jxl.write.Number number = new jxl.write.Number(1, 1, 30, greyBackground);
        sheet.addCell(number);
        
        sheet.mergeCells(1, 0, 3, 0); 
//        sheet.mergeCells(1, 1, 1, 1);
        
        ExcelGeneratorUtils test = new ExcelGeneratorUtils();
        test.exportExcel(book);
	}
}
