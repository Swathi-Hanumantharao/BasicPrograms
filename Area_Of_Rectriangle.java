package basicsprograms;

import java.util.Scanner;

public class Area_Of_Rectriangle {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the Value of L");
	int L = s1.nextInt();
	System.out.println("Enter the value of B");
	int B = s1.nextInt();
	int Rect = L*B;
	System.out.println("Area of Rectangle is->"+ Rect);
	
	
	
}
}
