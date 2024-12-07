package basicsprograms;

import java.util.Scanner;

public class OrOperatoer {
	static int a;
	static int b;
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=s1.nextInt();
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		if (a>b ||a!=b)
		
		{
			System.out.println("1");
			
		}
		if(a<b||a==b)
		{
			System.out.println("2");
			
		}
		if(a<10 || a==20)
			
		{
			System.out.println("3");
		}
		
	}
	

}
