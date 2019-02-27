//Write a program to find the number of vowels and consonants in the given string.


import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		int vowels = 0, consonants = 0;
		Scanner sc = new Scanner(System.in);
		String s = "Happy day";
		for(int i=0 ; i< s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e') {
				vowels += 1;
			}
			else {
				if(s.charAt(i)!=' ')
				consonants += 1;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
		
	}

}
