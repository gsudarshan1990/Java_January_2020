package JavaExceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[]=new int[4];
		
		try
		{
			System.out.println("This is printed before the occurence of the Exception");
			
			number[7]=4;
			
			System.out.println("This is printed after the occurence of the Exception");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			
			System.out.println("Array Index Out of bound Exception is caught");
			a.printStackTrace();
		}
	}

}
