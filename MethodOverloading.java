package basicsprograms;

public class MethodOverloading {
	static void  Addition1(int a)
	{
	System.out.println(a);
	
	}
	static void Addition1(int a, int b)
	{
		System.out.println(a+b);;
		
	}
	void Addition1(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void Addition1(int a, int b, double c)
	{
		System.out.println(a+b+c);
	}
	void Addition1(char C, String S)

	{
		
		System.out.println("My althabet is " + C);
		System.out.println("My name is " + S);
	}
	
	public static void main(String[] args) {
		Addition1(100);
		Addition1(200, 300);
		MethodOverloading n1 = new MethodOverloading();
		n1.Addition1(100, 200, 300);
		n1.Addition1(100, 200, 12.5);
		n1.Addition1('A', "Swathi");
	}

}
