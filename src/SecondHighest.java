//Write a method which accepts an array of integers as a parameter and returns the second highest element in the given array. If there are multiple such element, it can be printed just once.



import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int a[] = new int[5] ;
		for(int i=0; i<a.length ;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0 ;i<a.length ;i++) {
			for(int j=0 ;j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("Second largest element is "+a[a.length-2]);
	}

}
