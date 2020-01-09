package BasicJavaPrograms;

import java.util.concurrent.TimeUnit;

public class ExampleStaticProgram {
	int a;
	static int b;
	final int c=20;
//	ExampleStaticProgram()
//	{
//		super();
//	}
	public static void main(String[] args) {
		
		
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ExampleStaticProgram esp=new ExampleStaticProgram();
		System.out.println(esp.a);
		System.out.println(esp.b);
		System.out.println(esp.c);
		esp.a=10;
		System.out.println(esp.a);
		b=15;
		System.out.println(b);
	//	new ExampleStaticProgram().c=15;
		System.out.println(esp.c);

	}

}
