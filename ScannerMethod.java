package basicsprograms;

import java.util.Scanner;
public class ScannerMethod
{
  boolean expresion(int a)
{
	if (a==1)
	{
		System.out.println("True");
		return true;
	}
	else 
		{
			System.out.println("False");
			return  false;
		}
	

}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name");
		String Firstname = s1.next();
	System.out.println("Are you graduate?");
	
	byte V1 = s1.nextByte();
	ScannerMethod n1 = new ScannerMethod();
	n1.expresion(V1);
	
	}

}
