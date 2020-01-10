package JavaExceptions;

class Execution_One
{
	public void generate_method()
	{
		int number[]=new int[4];
		System.out.println("This Statement is printed before the exception");
		
		number[7]=10;
		
		System.out.println("This is the second statement");
	}
	
}


public class ExceptionExampleSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Execution_One eo=new Execution_One();
		
		try
		{
			eo.generate_method();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array Index Out of Bounds Exception is Caught");
			a.printStackTrace();
		}
	}

}
