import java.util.Scanner;

//Write a program to find the frequency of each word that appears in the string of words input by the user.

public class StringFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0,wTimes,next=0;
		
		String w[] = new String[10];
		int r[] = new int[10] ;
		String s1 = "java is good . I love is java love java love java";
		String s[] = s1.split(" ");
		
		for(int i=0;i<s.length;i++) {
			boolean wordRepeated = false;
			for(int j=0 ;j<w.length;j++) {
				if(s[i].equals(w[j])) {
					wordRepeated = true;
					break;
				}
			}
			if(!wordRepeated) {
			wTimes = 0;
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equals((s[j]))) {
					wTimes += 1;
					
				}
			}
			w[next++] = s[i];
			r[count++]	= wTimes;
			}
			}
		
		for(int i=0;i<w.length;i++) {
			
		System.out.println(w[i]+" = "+r[i]);
		}
		
	}
	
	
}

