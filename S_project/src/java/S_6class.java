//fetching data from excel sheet


package java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S_6class {
 public static void main(String[]args) throws EncryptedDocumentException, IOException
 {  
	 String path="C:\\Users\\MONIKA\\eclipse-workspace\\login credentials.xlsx";
	
	 FileInputStream excel=new FileInputStream(path);
   
	 
    String values=WorkbookFactory.create(excel).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();	
    System.out.println(values);
	  
	   }
 
}
 
 

