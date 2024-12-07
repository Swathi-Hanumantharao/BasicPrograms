package basicsprograms;

import java.util.Scanner;

public class Area_Of_Triangle1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length");
		int l = s1.nextInt();
		System.out.println("Enter the Value of Breath");
		int B = s1.nextInt();
		
	   float area = (0.5f*B*l);
	   System.out.println("Area of triangle is ->"+area);
	  	
	}

}
