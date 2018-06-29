package tbca;

public class AddConcat {
	
	
	String[] finalWords = {};
    double[] numSetFinal = {};
    double[] numSetFinalDiv = {};

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
    	
	public double[] multiply(double [] a ,double [] b)
	{
	    double value = 0;
	    
	    for (int i = 0 ; i < a.length ; i++)
	    {
	        value = a[i] * b [i];
	        numSetFinal = addOneDoubleToArray(numSetFinal, value);
	    }
	    return numSetFinal;
	}
	
	
	public double[] Div(double [] a ,double [] b)
	{
	    double value = 0;

	    for (int i = 0 ; i < a.length ; i++)
	    {
	        value = a[i] / b [i];
	        numSetFinalDiv = addOneDoubleToArray(numSetFinalDiv, value);

	    }

	    return numSetFinalDiv;
	}
	
	public String[] Concat(String [] a , String [] b) {
	    String value = "";
	    
	    for (int i = 0 ; i < a.length ; i++)
	   
	    {
	        value = a[i] +" " + b [i];
	        finalWords = addOneStringToArray(finalWords, value);

	    }
	    return finalWords;
	}

}
