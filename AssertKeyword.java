package basicsprograms;

public class AssertKeyword {
	
	public static void main(String[] args) 
	{
		int age = 17;
	//	assert age>=18; //first synatax
		assert age>=18:"sorry the age of the person is not expected";
		System.out.println("The person of age" +age);
		
	}

}
