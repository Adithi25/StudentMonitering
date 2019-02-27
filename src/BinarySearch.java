import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 7 array elements");
		int a[] = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number to search");
		int n = sc.nextInt();
		int low = 0,high=a.length-1;
		boolean status = Binarysearch(a, n,low,high);
		if (status == true)
			System.out.println("Search is successfull");
		else
			System.out.println("Search is unsuccessfull");
	}

	private static boolean Binarysearch(int[] a, int n,int low,int high ) {
		if(low<=high) {
		int mid = (low+high)/2;
		if(a[mid] == n) {
			return true;
		}
		else if(a[mid] > n) {
			high = mid-1;
			return Binarysearch(a, n,low,high);
		}
		else {
			//low = mid+1;
			return Binarysearch(a, n,mid+1,high);
		}
		}
		return false;
	}
	}


