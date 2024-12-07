package basicsprograms;

public class NonStaticMethod_InMainMethod {
	
	void Addition()
	{
		System.out.println("My name is swathi");
	}
	void sustraction()
	{
		System.out.println("Subtraction");
	}
   void Multipliaction()
   {
	   System.out.println("Multiplication");
   }
   void Division()
   
   {
   System.out.println("Division");
   }
	

	public static void main(String[] args) {
		
		NonStaticMethod_InMainMethod v1=new NonStaticMethod_InMainMethod();
		v1.Addition();
		System.out.println("My Main method");
		v1.sustraction();
		v1.Division();
		v1.Multipliaction();
		v1.sustraction();
	}
	
	
}
