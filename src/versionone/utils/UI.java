package versionone.utils;

import versionone.bean.ResultBean;



public class UI {

    public UI()
    {

    }	
	
	public static void GenerateVersionOneScheduleReport(ResultBean versionOneReport, String  membersExcelPath, String backlogExcelPath) throws Exception
	{
		VersionOneExcelGeneratorUtils readData = new VersionOneExcelGeneratorUtils();
		ResultBean[] versionOneReportResult = readData.backlogAndMembersExcelParser(versionOneReport, membersExcelPath, backlogExcelPath);
	
		ReportResultGeneratorUtils writeData = new ReportResultGeneratorUtils();
		writeData.versionOneScheduleDataParser(versionOneReportResult);
	}
}
