import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		permutation(s);
	}

	private static  void permutation(String s) {
		int r[] = new int[5];
		char s1[] = new char[5];
		int n = s.length();
		int res,rep,count=0 ;
		repeated(s ,r ,s1 ,count);
		res = fact(n);
		while(count!=0) {
			res /= fact(r[count--]);
		}
		System.out.println(res);
	}

	private static void repeated(String s,int[] r,char[] s1,int count) {
		
		int wTimes = 0,next=0;
		for(int i=0;i<s.length();i++) {
			boolean wordRepeated = false;
			for(int j=0;j<s1.length;j++) {
				if(s.charAt(i)==s1[j]) {
					wordRepeated = true;
					break;
				}
			}
			if(!wordRepeated) {
			for(int j=i+1;j<s.length();i++) {
				if(s.charAt(i)==s.charAt(j)) {
					wTimes += 1;
				}
			}
			s1[next++] = s.charAt(i);
			r[count++]=wTimes;
		}
		}
	}

	private static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n * fact(n-1);
	}

}
