package JavaPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// The formula for area of circle is pie*r*r.Where r is the radius
		//pie value is 3.14
		//radius will be inputed from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=sc.nextInt();
		areaOfCircle(r);
		sc.close();
	}
	
	public static void areaOfCircle(int r) {
		
		double area=3.14*r*r;
		System.out.println("The area of the circle is:"+area);
		
		
	}

}
