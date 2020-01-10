package BasicJavaPrograms;

enum states
{
	TELENGANA, TAMIL_NADU, RAJASTHAN, KERALA, KARANATAKA
}

public class EnumExampleSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		states st;
		
		st=states.KARANATAKA;
		
		System.out.println("The state with kanada language:"+st);
		
		st=states.TAMIL_NADU;
		
		System.out.println("The State with Tamil Language:"+st);
		
		st=states.TELENGANA;
		
		System.out.println("The State with the Telugu language:"+st);
		
		st=states.RAJASTHAN;
		
		System.out.println("The State with the Rajasthani language:"+st);
		
		st=states.KERALA;
		
		System.out.println("The State with the Malayalam language:"+st);
		
	}

}
