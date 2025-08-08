package week1.day2;
import java.util.Arrays;

public class Missing_number {


		 public static void main(String[] args) {
		        // initialize array values
		        int[] arr = {1, 2, 3, 4, 7, 6, 8};

		        // Sort the array or ascending order 
		        Arrays.sort(arr);

		        // Loop  the array
		        for (int i = 0; i < arr.length - 1; i++) {
		            // Check the next number
		            if (arr[i] + 1 != arr[i + 1]) {
		         // find the missing no
		                System.out.println("Missing number is: " + (arr[i] + 1));
		                // stop find the missing no  stop the loop
		                break;
		               
		            }
		        
		    }
		}

	
}

