import java.util.Scanner;

public class NotOrderMissing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 7 array elements");
		int a[] = new int[7] ;
		for(int i=0; i<a.length ;i++) {
			a[i] = sc.nextInt();
		}
		int min = findMin(a);
		int max = findMax(a);
		int missing = findMissing(a,min,max);
		System.out.println("Missing element is : "+missing);
	}

	private static int findMissing(int[] a, int min, int max) {
		boolean res= true;
		int missing=0;
		for(int i=min+1;i<=max-1;i++) {
			for(int j=0;j<a.length;j++) {
				res = true;
				if(a[j]==i) {
					res= false;
					break;
				}
			}
			if(res==true) {
				missing = i;
				break;
			}
		}
		return missing;
	}

	private static int findMax(int[] a) {
		int max =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] >max)
				max = a[i];
		}
		return max;
	}

	private static int findMin(int[] a) {
		int min =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] < min)
				min = a[i];
		}
		return min;
	}

}
