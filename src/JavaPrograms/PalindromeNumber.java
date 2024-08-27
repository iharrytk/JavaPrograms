package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Reverse of a number is always same as number
		// Very similar to reverse a String .But Palindrome is for numbers.

		isPalindrome(757);

	}

	public static void isPalindrome(int number) {

		System.out.println("The number provide is:" + number);

		int temp;
		int reversedNumber = 0;
		temp = number;// the input number is taken into temporary variable
		// Loops through as long as temp variable is greater than 0
		// In each iteration temp value reduces by 1 digit as the last digit is being
		// added to reversedNumber
		while (temp > 0) {
			// Logic:Take the reminder of temp variable after dividing it by 10.this gives
			// the last digit of the temp
			int a = temp % 10;
			// The last digit is added to reversedNumber plus reversedNumber*10
			reversedNumber = (reversedNumber * 10) + a;
			// Now the temp variable is divided by 10,so that quotient will contain only
			// (numberofactualdigitsofNumber-1).To move on with further interation
			temp = temp / 10;
		}
		System.out.println("The reverse of the provided number is:" + reversedNumber);

		if (number == reversedNumber) {
			System.out.println("The number is a Palindrome");

		} else {
			System.out.println("The number is not a palindrome");
		}

	}

}
