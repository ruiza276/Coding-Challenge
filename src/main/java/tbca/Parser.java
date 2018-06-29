package tbca;

import org.apache.poi.ss.usermodel.*;

public class Parser {
	
	String[] words = {};
    double[] numSetOne = {}; 
    double[] numSetTwo = {}; 

    
	private static double[] addOneDoubleToArray(double[] initialArray , double newValue) {
	
	    double[] newArray = new double[initialArray.length + 1];
	    for (int index = 0; index < initialArray.length; index++) {
	        newArray[index] = initialArray[index];
	    }

	    newArray[newArray.length - 1] = newValue;
	    return newArray;
	}
	
	
	private static String[] addOneStringToArray(String[] initialArray , String newValue) {

	    String[] newArray = new String[initialArray.length + 1];
	    for (int index = 0; index < initialArray.length; index++) {
	        newArray[index] = initialArray[index];
	    }

	    newArray[newArray.length - 1] = newValue;
	    return newArray;
	}	
	
	
	public void parse(Sheet sheet) { 


    // Decide which rows to process
    int rowStart = Math.min(15, sheet.getFirstRowNum());
    int rowEnd = Math.max(1400, sheet.getLastRowNum());


    for (int rowNum = rowStart + 1 ; rowNum < rowEnd; rowNum++) {
       Row r = sheet.getRow(rowNum);
       if (r == null) {
          continue;
       }

       int lastColumn = Math.max(r.getLastCellNum(), r.getFirstCellNum());

       for (int cn = 0; cn < lastColumn; cn++) {
    	 
          Cell c = r.getCell(cn);

          if (c.getCellTypeEnum() == CellType.STRING) {
        	  words = addOneStringToArray(words, c.getStringCellValue());
        	  }
          
          else if(cn == 1){

        	  numSetTwo = addOneDoubleToArray(numSetTwo, c.getNumericCellValue());	  
          		}
          
          else{

        	 numSetOne = addOneDoubleToArray(numSetOne, c.getNumericCellValue());

          		}
       		}
    	}
    
	}
}
