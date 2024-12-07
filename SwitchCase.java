package basicsprograms;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the case");
		int input =s1.nextInt();
		switch(input)
		
		{
		case 1: System.out.println("Launching the crome Browser:->");
		        break;
		case 2 :System.out.println("Launcing the firefox Browser->");
		        break;
		case 3: System.out.println("Launching the internet explorer->");
		        break;
		default : System.out.println("dont execute anything");
		
		}
		
		
	} 
	

}
