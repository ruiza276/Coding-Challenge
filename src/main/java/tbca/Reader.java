package tbca;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


public class Reader {
	
	public static final String data1 = "./Data1.xlsx"; //First Sheet
	public static final String data2 = "./Data2.xlsx"; //Second Sheet
	
	public static Parser parser1 =  new Parser();//One for each Excel File
	public static Parser parser2 =  new Parser();
	public static AddConcat addconcat = new AddConcat();//This is where the final Arrays are at

	
	
	
	

	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		 
		Workbook workbook1 = WorkbookFactory.create(new File(data1)); //Making a workbook object for each each, easier access
		Workbook workbook2 = WorkbookFactory.create(new File(data2));
		
		
        Sheet sheet1 = workbook1.getSheetAt(0);
        Sheet sheet2 = workbook2.getSheetAt(0);
        
        parser1.parse(sheet1);
    	parser2.parse(sheet2);
    	
    	addconcat.multiply(parser1.numSetOne,  parser2.numSetOne);
    	addconcat.Div(parser1.numSetTwo, parser2.numSetTwo);
    	addconcat.Concat(parser1.words, parser2.words);
    	
	    for (int i = 0 ; i < addconcat.numSetFinal.length ; i++) {
	    	System.out.println(addconcat.numSetFinal[i]);
	    }    
	    
	    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "\n"); //For easier reading
	    
	    for (int i = 0 ; i < addconcat.numSetFinalDiv.length ; i++) {
	    	System.out.println(addconcat.numSetFinalDiv[i]);
	    }    	
    	    
	    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "\n");
    	
	    for (int i = 0 ; i < addconcat.finalWords.length ; i++) {
	    	System.out.println(addconcat.finalWords[i]);
	    }
    	
    	
    	


	}
}
