package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		//create 1st array
		int[] arr1 = {3,2,11,4,6,7};
		// create 2nd array
		int[] arr2 = {1,2,8,4,9,7};
		      // for loop in array1
		for(int i=0;i<arr1.length;i++) {
			// nested for loop in array2
		for(int j=0;j<arr2.length;j++) {
			// compare the numbers 
		if(arr1[i]==arr2[j]) {
			// print array1 (or) array2
			System.out.println(arr2[j]);
			
		}
		}
	}
	}
}
