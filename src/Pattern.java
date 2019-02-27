//Write a program to print the following output pattern.
 /*       1
         121
        12321
       1234321
      123454321   */

      

public class Pattern {
public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		int count = 0;
		for(int j=5; j>i ;j--) {
			System.out.print(" ");
		}
		
		for(int j=0 ;j < i+1 ;j++) {
			count += 1;
			System.out.print(count);
		}
		
		for(int k =count-1 ;k >= 1;k--) {
			count -= 1;
			
			System.out.print(count);
		}
		System.out.println();
	}
}
}
