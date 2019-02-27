import java.util.Scanner;

//Write a program to accept 2 numbers “m” and “n” from the user and determine m^n (without using predefined functions.

public class Power {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int m = sc.nextInt();
	System.out.println("Enter the number : ");
	int n = sc.nextInt();
	power(m,n);
}

private static boolean power(int m,int n) {
	int power = 1;
	if(n==0) {
		System.out.println("1");
		return false;
	}
	for(int i=0;i<n;i++) {
		power *= m;
	}
	System.out.println(power);
	return true;
}
}
