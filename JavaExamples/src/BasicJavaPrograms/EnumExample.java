package BasicJavaPrograms;

enum vehicle
{
	BENZ, TOYOTA, LAMBORGHINI, TATA
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		vehicle vh;
		
		vh=vehicle.BENZ;
		
		System.out.println("German Car Maker:"+vh);
		
		vh=vehicle.TOYOTA;
		
		System.out.println("Japan Car Maker:"+vh);
		
		vh=vehicle.LAMBORGHINI;
		
		System.out.println("Italian Car Maker:"+vh);
		
		vh=vehicle.TATA;
		
		System.out.println("Indian Car Maker:"+vh);
		
	}

}
