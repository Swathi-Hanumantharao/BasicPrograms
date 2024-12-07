package basicsprograms;

import java.util.Scanner;

public class ScannerTwo {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your Name");
		String Firstname= s1.next();
		System.out.println("are you graduate");
	    boolean B1 = s1.nextBoolean();
	    
	    System.out.println("Entet the byte value");
	     byte b1 = s1.nextByte();
	     s1.close();
		
		
	}

}
