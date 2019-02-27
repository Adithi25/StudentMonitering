import java.util.Scanner;

//Write a program to accept a number “n” from the user; find the sum of the series 1/23+1/33+1/43……..+1/n3.

public class SumOfSeries1 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = sc.nextInt();
	float ans = Sum(n);
	System.out.println("The sum of series is : "+ans);
}

private static float Sum(int n) {
	float sum =0;
	for(int i=2;i<=n;i++) {
		sum += 1/((double)i*i*i);
	}
	System.out.println("The sum of series is : "+sum);
	return sum;
}
}
