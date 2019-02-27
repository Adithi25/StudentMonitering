import java.util.Scanner;

//Write a program to print the Fibonacci series up to the number 34. (Example: 0,1,1,2,3,5,8,13,…Series 
//starts with 0 and 1, the succeeding numbers of the series are arrived by adding the previous 2 numbers.

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		fib(n);
	}

	private static boolean fib(int n) {
		int x1=0,x2=1,x3;
		if(n <1) {
			System.out.println("Fibonacci series not possible");
			return false;
		}
		else if(n == 1){
			System.out.println(x1);
			return false;
		}
		else if(n == 2) {
			System.out.println(x1+" "+x2);
			return false;
		}
		else {
			
			System.out.print(x1+" "+x2+" ");
			for(int i=0;i<n-2;i++) {
			x3=x1+x2;
			System.out.print(x3+" ");
			x1 = x2;
			x2 = x3;
		}
			return true;
		}
	}
}
