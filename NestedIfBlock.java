package basicsprograms;

import java.util.Scanner;

public class NestedIfBlock {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Gender");
		String xyz=s1.next();
		System.out.println("Enter the age");
		int age= s1.nextInt();
		
		
		/*char gender1='M';
		char gender2='F';
		*/
		
		if(xyz.contains("X") )
		{
			
		        if(age==12 || age<=59)
			
		           {
			          System.out.println("Full Ticket");
		           }
		           else 
		           {
			        System.out.println("Half Ticket");
		           }
		
		}
		else 
			
		{
			System.out.println("Free Tticket");
		}
		
	}
	
}
