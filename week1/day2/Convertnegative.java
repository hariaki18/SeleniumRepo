package week1.day2;

public class Convertnegative {

	 public static void main(String[] args) {
		    //  Initialize value
	        int number = -40; 
	        // Step 2: Check the  negative//
	        if (number < 0) {
	            // Convert to positive//
	            int positiveNumber = -number; 
	            //  Print result
	            System.out.println("The number " + number + " is converted to " + positiveNumber);
	        } else {
	            System.out.println("The number is already positive: " + number);
	        }
	    }
	}