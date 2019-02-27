import java.util.Scanner;

//Write a program to accept a number and determine whether it is a prime number or not.

public class Prime {
//hello 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		boolean flag = isPrime(n);
		if(flag ) {
			System.out.println("It is a prime number!!!");
		}
		else {
			System.out.println("It is not a prime number!!!");
		}
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
