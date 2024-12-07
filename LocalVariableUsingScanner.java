package basicsprograms;

import java.util.Scanner;

public class LocalVariableUsingScanner {
	static void add(int a, int b)
	{
		int sum= a+b;
		System.out.println("Addition of two num:->" +sum);
	}
	static void sub(int a, int b)
	{
		int sub= a-b;
		System.out.println("sutraction  of two num:->" +sub);
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s1.nextInt();
		System.out.println("Enter the value of b");
		int b = s1.nextInt();
		add(a,b);
		System.out.println("Enter the value of a");
		int c = s1.nextInt();
		System.out.println("Enter the value of b");
		int d = s1.nextInt();
		sub(c,d);
		
	}
	

}
