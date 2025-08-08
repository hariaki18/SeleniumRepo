package week1.day4;

public class Fibonacci_series {

	public static void main(String[] args) {
		// initialization values
		int series=10, n1=0,n2=1,n3;
		//print n1 and n2
		System.out.println(n1+","+n2);
		for(int i=2;i<=series;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
		}

	}

}

