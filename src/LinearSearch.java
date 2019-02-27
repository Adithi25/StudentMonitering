//Linear search

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 7 array elements");
		int a[] = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number to search");
		int n = sc.nextInt();
		boolean status = linearsearch(a, n);
		if (status == true)
			System.out.println("Search is successfull");
		else
			System.out.println("Search is unsuccessfull");
	}

	private static boolean linearsearch(int[] a, int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n)
				return true;
		}
		return false;
	}

}
