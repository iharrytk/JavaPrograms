package JavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args) {
		// Anagrams are nothing but Strings that are made up of same charecters
		// Example:cat and act

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first String:");
		String s1 = sc.next();

		System.out.println("Enter the second String:");
		String s2 = sc.next();
		isAnagram(s1, s2);
		sc.close();

	}

	private static void isAnagram(String s1, String s2) {
		
		//Convert the String to characters
		char[] char1=s1.toCharArray();//[c,a,t]
		char[] char2=s2.toCharArray();//[a,c,t]
		
		//sort the characters before comparing the two
		Arrays.sort(char1);//[a,c,t]
		Arrays.sort(char2);//[a,c,t]
		
		if(Arrays.equals(char1, char2)) {
			
			System.out.println("The Strings are anagram of each other");
		}
		else {
			System.out.println("The Strings are not anagram of each other");
		}
		
		
	}

}
