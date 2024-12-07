package basicsprograms;

import java.util.Scanner;

public class ArithemeticUsingGlobalVariable {
	static int a=100;
	static int b=200;
	static void add()
	{
	int sum= a+b;
	System.out.println("Addtition of two numbers:->" +sum);
	}
	static void sub()
	{
		int sub= a-b;
		System.out.println("subtraction  of two numbers:->" +sub);
	}
	static void mul()
	{
		int mult= a*b;
		System.out.println("multiplication of two numbers:->" +mult);
	}
	static void div()
	{
		int div= b/a;
		System.out.println("Division of two numbers:->" +div);
	}
	static void mod()
	{
		int modu= a%b;
		System.out.println("modulus of two numbers:->" +modu);
	}
	
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}

}
