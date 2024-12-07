package basicsprograms;

import java.util.Scanner;

public class Area_Of_Squar {
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s1.nextInt();
		System.out.println("Enter The value of second a");
		int b = s1.nextInt();
		 int square = a*b;
		System.out.println("Area of square is ->" +square);
		
	}

}
