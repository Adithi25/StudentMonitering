import java.util.Scanner;

//Write a program to accept a number from the user and find the reverse of the given number.

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		reverse(n);
	}

	private static void reverse(int n) {
		int x,rev=0;
		while(n!=0) {
			x = n % 10;
			
			rev = rev*10+x;
			n /= 10;
		}
		System.out.println(rev);
	}
	
	
}
