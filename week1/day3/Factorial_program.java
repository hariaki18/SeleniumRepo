package week1.day3;
import java.util.Scanner;

public class Factorial_program {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter a factorial no :");
      int number=scan.nextInt();
      
      int fact=1;
      for (int i=1; i<=number; i++
    		  ) {
    	
    	 fact=fact*i;
      }
      System.out.println("factorial is "+ fact);
	}

}
