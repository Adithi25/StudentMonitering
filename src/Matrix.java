import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix");
		int[][] a = {{1,4,7},{2,5,8},{3,6,9}};
		int[] b = new int[3];
		int sum=0 ,count=0;
		int min =a[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum += a[j][i];
			}
			b[count++]= sum;
			sum=0;
		}
		int temp =0;
		int imax = max(b);
		int imin = min(b);
		for(int i=0;i<3;i++) {
			temp = a[i][imin];
			a[i][imin] = a[i][imax];
			a[i][imax] =temp;
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		

}

	private static int min(int[] b) {
		int min = b[0],index=0;
		for(int i=0;i<b.length;i++) {
		if(min > b[i])
			index = i;
		}
		return index;
	}

	private static int max(int[] b) {
		int max = b[0],index=0;
		for(int i=0;i<b.length;i++) {
		if(max < b[i])
			index = i;
		}
		return index;
	}
}