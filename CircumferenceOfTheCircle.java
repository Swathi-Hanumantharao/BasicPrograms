package basicsprograms;

import java.util.Scanner;

public class CircumferenceOfTheCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double  pi = s1.nextDouble();
		System.out.println("Enter the value of R");
		double r = s1.nextDouble();
		double circum = 2*pi*r;
		System.out.println("Circumferance of the circle is=>" +circum);
			
	}
}
