import java.util.Scanner;

//Write a program to accept a five digit number and increment each digit by one and display the number (digit 9 gets incremented to 0).
//Example:
  //    Input: 14385
//Output: 25496
public class IncrByOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int m = n;
		int c = count(m);
		Incr(n,c); 
	}

	private static void Incr(int n,int c) {
		int res = 0 ;
		for(int i=c;i>0;i--) {
			int r =(int) Math.pow(10, i);
			int quot = n / r;
			if(quot!=9) {
				res += (quot + 1)*r;
			}
			else
				res += 0 * r;
			n = n % r;
		}
		System.out.println(res);
	}
	
	private static int count(int m) {
		int count =0;
		while(m!=0) {
			m = m /10;
			count++;
		}
		System.out.println(count);
		return count;
	}
}
