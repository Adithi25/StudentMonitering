import java.util.Arrays;
import java.util.Scanner;

//Write a program to accept 2 different numbers from the user and print the prime numbers between these 2 numbers

public class Prime2 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int n1 = sc.nextInt();
	System.out.println("Enter the second number : ");
	int n2 = sc.nextInt();
	
	int a[] = range(n1,n2);
	System.out.println("Prime numbers are : "+Arrays.toString(a));
}

private static int[] range(int n1,int n2) {
	int c=0;
	int arr[] = new int[10];
	for(int i=n1+1;i<n2;i++) {
		boolean isPrime = isPrime(i);
		if(isPrime) {
			arr[c++] = i;
		}
			
	}
	return arr;
}

private static boolean isPrime(int n) {
	if(n<2)
		return false;
	for (int i = 2; i <= n/2; i++) {
		if (n % i == 0) 
			return false;
	}
	return true;
}


}
