package init;

import javax.naming.spi.DirStateFactory.Result;

import versionone.bean.ResultBean;
import versionone.utils.ExcelGeneratorUtils;
import versionone.utils.UI;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        ExcelGeneratorUtils test = new ExcelGeneratorUtils();
        String[] userNameList = {"Alston Meng", 
    		"Amy Chen", 
    		"Clark Lang",
    		"Haiyun Jiang", 
    		"Lily (Xiaoxin) Wu", 
    		"Lina Xiao", 
    		"Mansur Ma", 
    		"Stella Gao",
    		"Sunway Li",
    		"Yvonne Yu"};
        ResultBean versionOneReport = new ResultBean(userNameList);
        
        String a = "12";
        int b = Integer.parseInt(a);
        System.out.println(b);
        UI.GenerateVersionOneScheduleReport(versionOneReport, "c:/cdp/Members test.xls", "c:/cdp/Backlog test.xls");
    }
}
