package basicsprograms;

public class OverloadingMainMethod {
	
	public static void main() {
		System.out.println("Print with no argument list");
		
	}
	public static void main(int a, int b) {
		System.out.println("Print with argumnet list");
		
	}
	public static void main(int a, int b, int c) {
		System.out.println("print with multiple argument list");
		
	}
	public static void main(String S, char c) {
		System.out.println("Print with String and C"  + S  +c);
	}
	public  void main(double b, double d) {
		System.out.println("Arthi");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Print Main Method");
		main();
		main(10, 20);
		main(10, 20 , 30);
		main("Swathi", 'A');
		OverloadingMainMethod n1 = new OverloadingMainMethod();
		n1.main(12.4, 12.8);
		
		
	}

}
