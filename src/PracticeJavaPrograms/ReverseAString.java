package PracticeJavaPrograms;

import java.util.Scanner;

public class ReverseAString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value to be reversed:");
		String tobereversed=sc.next();
		
		//String tobereversed="haritha";
		doReverse(tobereversed);
		sc.close();

	}
	
	public static void doReverse(String var) {
		
		String reversed="";
		for(int i=var.length()-1;i>=0;i--) {
			reversed=reversed+var.charAt(i);
			
		}
		System.out.println("The reversed String is:"+reversed);
	
		
	}
	
	
	

}
