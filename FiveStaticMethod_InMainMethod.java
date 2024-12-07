package basicsprograms;

public class FiveStaticMethod_InMainMethod {
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
	static int Mult()
	
	{
		System.out.println("Multiplication");
		return 0; 
	}
	
	static boolean div()
	{
		System.out.println("Division");
		return true;
		
	}
	static float mod()
	{
		System.out.println("Modulus");
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println("Manmath");
		add();
		mod();
		div();
		Mult();
		sub();
	}

}
