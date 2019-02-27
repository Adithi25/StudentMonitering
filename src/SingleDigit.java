import java.util.Scanner;

//Write a program to accept a number from the user and find the sum of digits of the number; repeat the operation until the sum gets to be a single digit number.

public class SingleDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		singleSum(n);
	}

	private static void singleSum(int n) {
		int x,sum=0;
		while(n > 9) {
			x = n % 10;
		n = n / 10;
		sum = x+n;
		n = sum;
		}
		System.out.println(sum);
	}
}
