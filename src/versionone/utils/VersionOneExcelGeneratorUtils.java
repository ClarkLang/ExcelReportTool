package versionone.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import versionone.bean.ResultBean;
import versionone.utils.ExcelGeneratorUtils;
import jxl.Sheet;

public class VersionOneExcelGeneratorUtils {

	/**
	 * Method to parse the backlog And members excel data to ResultBean
	 * 
	 * @param versionOneReport
	 * @param backlogExcelPath
	 * @param membersExcelPath
	 * @return
	 */
	public ResultBean[] backlogAndMembersExcelParser(ResultBean versionOneReport, String  membersExcelPath, String backlogExcelPath) throws Exception
	{
		//parse members excel frist, and then backlog excel
		ResultBean[] versionOneReportResult = membersExcelParser(versionOneReport, membersExcelPath);
		versionOneReportResult = backlogExcelParser(versionOneReportResult, backlogExcelPath);
		return versionOneReportResult;
	}
	 
	/**
	 * Method to parse the members excel data to ResultBean
	 * 
	 * @param versionOneReport
	 * @param membersExcelPath
	 * @return
	 */
	public ResultBean[] membersExcelParser(ResultBean versionOneReport, String membersExcelPath) throws Exception
	{
		//open the Members Excel, get sheet data
        ExcelGeneratorUtils getMembersExcelData = new ExcelGeneratorUtils();
        Sheet sheet = getMembersExcelData.readExcel(membersExcelPath);

        //get sheet row length
        int rsRows = sheet.getRows();  
        ResultBean[] versionOneReportResult = new ResultBean[rsRows];
    	String username = null;
    	
    	//set the ResultBean from sheet data
        for (int i = 1; i < rsRows; i++)   
        {   
    		versionOneReportResult[i] = new ResultBean();
        	if(sheet.getCell(0, i).getContents() != "") {
        		username = sheet.getCell(0, i).getContents();
        		//set user's name
            	versionOneReportResult[i].setUserName(username);
        		//set user's Capacity
        		versionOneReportResult[i].setCapacity(sheet.getCell(8, i).getContents());
        		//set user's Detail Estimate
        		versionOneReportResult[i].setDetailEstimate(sheet.getCell(9, i).getContents());
        		//set user's To DO
        		versionOneReportResult[i].setToDO(sheet.getCell(10, i).getContents());
        	} else {
        		//set user's name
            	versionOneReportResult[i].setUserName(username);
        		//set user's Title
            	versionOneReportResult[i].setTitle(sheet.getCell(1, i).getContents());
        		//set user's Backlog
            	versionOneReportResult[i].setBacklog(sheet.getCell(4, i).getContents());
        		//set user's Feature Group
            	versionOneReportResult[i].setFeatureGroup(sheet.getCell(5, i).getContents());
        		//set user's Owner
            	versionOneReportResult[i].setOwner(sheet.getCell(7, i).getContents());
        		//set user's Detail Estimate
        		versionOneReportResult[i].setDetailEstimate(sheet.getCell(9, i).getContents());
        		//set user's To DO
        		versionOneReportResult[i].setToDO(sheet.getCell(10, i).getContents());
        		//set user's ID
            	versionOneReportResult[i].setId(sheet.getCell(7, i).getContents());
        		//set user's Dev Complete Planned Date
            	versionOneReportResult[i].setDevCompletePlannedDate(sheet.getCell(14, i).getContents());
        	}
        }
        
		return versionOneReportResult;
	}
	
	/**
	 * Method to parse the backlog excel data to ResultBean
	 * 
	 * @param versionOneReport
	 * @param backlogExcelPath
	 * @return
	 */
	public ResultBean[] backlogExcelParser(ResultBean[] versionOneReportResult, String backlogExcelPath) throws Exception
	{		
		//get every BI's dev complete date
        Map biList = getDevCompletePlannedDateFromBacklogExcel(backlogExcelPath);
        
        //use hashmap Iterator to do the traversal, to set user's BI's dev complete date by matching same backlog
        Iterator iter = biList.entrySet().iterator();
        while (iter.hasNext()) 
        {
	        Map.Entry entry = (Map.Entry) iter.next();
	        String biBacklog = entry.getKey().toString();
	        String biDevCompletePlannedDate = entry.getValue().toString();
	        
	        for (int i = 1; i < versionOneReportResult.length; i++)   
	        {   
        		if(versionOneReportResult[i].getBacklog() == biBacklog){
        			versionOneReportResult[i].setDevCompletePlannedDate(biDevCompletePlannedDate);
        		}
	        }        
        }
		return versionOneReportResult;
	}
	
	/**
	 * Method to get BI's dev complete planned data from backlog Excel
	 * @param backlogExcelPath
	 * @return
	 * @throws Exception
	 */
	public Map getDevCompletePlannedDateFromBacklogExcel(String backlogExcelPath) throws Exception
	{
		//open the Backlog Excel, get sheet data
        ExcelGeneratorUtils getMembersExcelData = new ExcelGeneratorUtils();
        Sheet sheet = getMembersExcelData.readExcel(backlogExcelPath);
        
        //get sheet row length
        int rsRows = sheet.getRows();  
    	String username = null;
		Map biList = new HashMap();
		
    	//set the dev complete planned data if this tasks' is exist
        for (int i = 1; i < rsRows; i++)   
        {   
        	if(sheet.getCell(0, i).getContents() != "" && sheet.getCell(12, i).getContents() != "") {
            	biList.put(sheet.getCell(0, i).getContents(), sheet.getCell(12, i).getContents());
        	}
    	}
        return biList; 
	}

}
