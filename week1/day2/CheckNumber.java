package week1.day2;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number : ");
		int number =scan.nextInt();
		if(number>0) {
			System.out.println("the number is positive");
		}
		else if(number<0) {
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number neither positive or negative");
		}

	}

}
