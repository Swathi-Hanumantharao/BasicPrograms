package basicsprograms;

import java.util.Scanner;


public class Area_Of_triangle {
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of Pi");
		double pi = s1.nextDouble();
		System.out.println("Enter the value of r");
		double r = s1.nextDouble();
		Double Area = pi*r*r;
		System.out.println("Area of Triyangle is ->" + Area);
			
	}

}
