package JavaPrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// Literally we are reversing a String
		// Example input="lion" ,output='noil"

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String that needs to be reversed");
		String s1 = sc.next();
		doReverseString(s1);
		sc.close();

	}

	public static void doReverseString(String s1) {

		// Loop through the String in reverse order.
		// The length of the String is always +1.The indexing starts from 0 to length-1
		// To break the loop zeroth index should be reached
		String reversed = "";
		for (int i = s1.length() - 1; i >= 0; i--) {

			// Adding value to reversed String by taking the characters from String s1 using
			// the index
			reversed = reversed + s1.charAt(i);

		}
		System.out.println("The reversed string is:" + reversed);

	}
}
