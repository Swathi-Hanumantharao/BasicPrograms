package basicsprograms;

public class StaticNonStaticInMainMethod {
	
	static void Addtion1()
	{
		System.out.println("Enter the value a of A and B");
	}
	
	void Subtraction()
	{
		System.out.println("Subtraction of two numbers");
	}
	
	public static void main(String[] args) {
		System.out.println("this is main mathod");
		StaticNonStaticInMainMethod v1 = new StaticNonStaticInMainMethod();
		v1.Subtraction();
		Addtion1();
		
		
		
	}

}
