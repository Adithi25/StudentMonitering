import java.util.Scanner;

public class DescendingMissing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 7 array elements");
		int a[] = new int[7] ;
		for(int i=0; i<a.length ;i++) {
			a[i] = sc.nextInt();
		}
		int m =a[0] ,n=a[a.length-1], mNo=0;
		
		int count = m-n;
		for(int i=0;i<=count;i++) {
			
			if(a[i]!=m) {
				mNo = m;
				break;
			}
			m--;
		}
		System.out.println("Missing number in ascending order is "+mNo);
	}

}
