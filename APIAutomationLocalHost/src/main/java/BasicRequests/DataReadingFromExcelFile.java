package BasicRequests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReadingFromExcelFile {

	
	
	// Excel sheet code 
	
	public static void main(String[] args) throws IOException {
	        String pathofExcelSheet = "C:\\Users\\Ahishek Singh\\"+"OneDrive\\Desktop\\ExcelSheetDataReading.xlsx";
	        File file = new File(pathofExcelSheet);
	        FileInputStream fis = new FileInputStream(file);
	        
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	        XSSFSheet sheetOfInterest = wb.getSheet("Sheet1");
	        XSSFRow rowOfInterest = sheetOfInterest.getRow(1);
	        System.out.println(rowOfInterest.getCell(1).getStringCellValue().toString());
	    }
}
