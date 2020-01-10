package BasicJavaPrograms;

public class StaticAndInstanceBlock {
	
	static 
	{
		System.out.println("This block is executed with out the object created");
	}
	
	{
		System.out.println("This block is executed when the object is created");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticAndInstanceBlock sb=new StaticAndInstanceBlock();
		
	}

}
