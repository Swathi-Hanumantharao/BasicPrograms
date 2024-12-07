package basicsprograms;

import java.util.Scanner;

public class IfElseBlock {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the age");
		int age= s1.nextInt();
		if(age>=18)
		{
			System.out.println("eligible to vote");
			
		}
		else
			
		{
			System.out.println("not eligible to vote");
		}
	}
	
}
