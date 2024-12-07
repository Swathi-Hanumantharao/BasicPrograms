package basicsprograms;

public class Global_variable1 {
static int a= 100;//static gloabal variable
int b=200; // non static global varivale
	public static void main(String[] args) {
		a=200; // updating static gobal variable
		System.out.println(a);
		Global_variable1 g1= new Global_variable1();
		g1.b=900;
		System.out.println(g1.b);
		
	}
}
