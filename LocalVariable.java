package basicsprograms;

public class LocalVariable {
	
		static void Add()
		
 
		{
			int a=100;
			int b=2000;
			int sum = a+b;
			System.out.println("The Addition of two number are " +sum);
		}
		static void sub()
		{
			int a = 200;
			int b = 150;
			int sub = a-b;
			System.out.println("The subtraction of two numbers" +sub);
		
		}
		void Mul()
		{
			int a = 20;
			int b= 40;
			int mult = a*b;
			System.out.println("The multiplication of two numbers"   +mult);
		}
		
		void div()
		{
			int a=20;
			int b=3;
			float divi=a/b;
			System.out.println("the Devidion of to numbers are " +divi);
		}
		 static void modulus()
		 {
			int  a=300;
			int  b=200;
			 int mod = a%b;
			 System.out.println("The modules of two number " + mod);
		 }

		public static void main(String[] args)
		{
			ArithemeticOperatorUsingComplier n1= new ArithemeticOperatorUsingComplier();
			Add();
			sub();
			n1.Mul();
			n1.div();
			modulus();
		
	}

}
