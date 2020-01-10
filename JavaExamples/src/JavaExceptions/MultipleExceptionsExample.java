package JavaExceptions;

public class MultipleExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerator[]={82,38,65,29,67,28,33};
		int denominator[]={7,0,13,6,5};
		
		for(int i=0;i<numerator.length;i++)
		{
			try
			{
				System.out.println(numerator[i]/denominator[i]);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Arithematic Exception is Caught");
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Array Index Out of Bounds Exception is Caught");
			}
		}
	}

}
