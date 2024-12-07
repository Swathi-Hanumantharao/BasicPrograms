package basicsprograms;

public class GlobalVariable 
{
	 static int a= 100; //global variable
	 int c= 400;
	 static double pi;
	 static String name;
	 static byte b;
	 static int u;
	 static short s;
	 static long l;
	 static float f;
	 static char h;
	 static boolean answer;
	 
	
	 
	
	public static void main(String[] args) {
		 
		int b = 200; //local variable
		System.out.println(b+a);
		System.out.println(pi);
		name = "manish";
		System.out.println(name);
		System.out.println(b);
		System.out.println(u);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(h);
		answer= true;
		System.out.println(answer);
		answer= true;
	}
	
}
