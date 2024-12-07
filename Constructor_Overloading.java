package basicsprograms;

public class Constructor_Overloading {
	
	Constructor_Overloading()
	{
		System.out.println("1st");
	}
	Constructor_Overloading(int a)
	{
		System.out.println("2nd");
	}
	Constructor_Overloading(int a, double b)
	{
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		Constructor_Overloading n1 = new Constructor_Overloading();
		new Constructor_Overloading(20);
		new Constructor_Overloading(30,12.4);
		
		
		
	}

}
