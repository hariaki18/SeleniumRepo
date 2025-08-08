package week1.day2;
import java.util.Scanner;

public class Factorial_program {

	public static void main(String[] args) {
		
		// create a object in scanner
		Scanner scan =new Scanner(System.in);
		// print enter no
		System.out.println("enter a number :");
      int number=scan.nextInt();
      // assume fact = 1
      int fact=1;
      //local variable i is initialize value 1, condition ,increment
      for (int i=1; i<=number; i++) {
    //fa= 1x1=1,fa=1x2=2,fa=2x3=6,fa=6x4=24,fa=24x5=120
    	 fact=fact*i;
      }
      //print the fact variable
      System.out.println("factorial is "+ fact);
	}

}
