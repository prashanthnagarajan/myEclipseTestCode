package abstraction;

public class Benz extends Car {
	
	@Override
	public void CarSecret(){
		System.out.println("Benz Car Sceret");
	}
	
	public void CarEngineScret() {
		System.out.println("Benz Car Engine Sceret");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benzcar =new Benz();
		benzcar.CarEngineScret();
		benzcar.CarSecret();

	}

}
