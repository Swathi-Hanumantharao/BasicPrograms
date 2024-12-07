package basicsprograms;

import java.util.Scanner;

public class GloabalVariableUsingScannerClass {
	static int a;
	
	 static void add(int b)
		{
		 int sum=a+b;
		 System.out.println("Addition of two numbers"+ sum);
	}
	 static void sub(int b)
		{
		 int sub =a-b;
		 System.out.println("subtraction of two numbers" + sub);
	}
	 static void mul(int b)
		{
		 int mul =a*b;
		 System.out.println("Multiplication of two numbers of two numbers"+ mul);
	}
	 static void div(int b)
		{
		 int div =a*b;
		 System.out.println("Division of two numbers"+div);
	}
	 static void mod(int b)
		{
		 int mod =a*b;
		 System.out.println("Modulus  of two numbers"+mod);
	}
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
	     a = s1.nextInt();
	     
		//GloabalVariableUsingScannerClass g1= new GloabalVariableUsingScannerClass();
		System.out.println("Enter the valiue of b");
		int b =s1.nextInt();
		GloabalVariableUsingScannerClass g1= new GloabalVariableUsingScannerClass();
		b=100;
		add(b);
		sub(b);
		mul(b);
		div(b);
		mod(b);
		
		
	}	

}
