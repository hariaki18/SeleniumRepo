package week1.day2;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
		// create scanner object
		Scanner scan = new Scanner(System.in);
		// print enter no
		System.out.println("enter the number : ");
		// get user input
		int number =scan.nextInt();
		//positive no , check the condition 
		if(number>0) {
			System.out.println("the number is positive");
		}
		// negative no, check the condition  
		else if(number<0) {
			System.out.println("the number is negative");
		}
		// both condition are not satisfaction come else
		else {
			System.out.println("the number neither positive or negative");
		}

	}

}
