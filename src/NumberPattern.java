//10. Printing number pattern
public class NumberPattern {

	public static void main(String[] args) {
int count;
for(int i=0;i<5;i++) {
	count=1;
	for(int j=5;j>i-1;j--)
		System.out.print(" ");
	for(int j=0;j<=i;j++)
		System.out.print(count++);
	--count;
	for(int j=0;j<i;j++)
		System.out.print(--count);
	System.out.println();
}
	}

}
