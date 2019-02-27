import java.util.Scanner;

//Write a program to accept a number “n” from the user; then display the sum of the series 1+1/2+1/3+……….+1/n.

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		float ans = Sum(n);
		System.out.println("The sum of series is : "+ans);
	}
	
	private static float Sum(int n) {
		float sum =0;
		for(int i=1;i<=n;i++) {
			sum += (1/(double)i);
		}
		System.out.println("The sum of series is : "+sum);
		return sum;
	}
}
