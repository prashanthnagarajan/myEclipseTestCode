package abstraction;

public class Bmw extends Car implements InterfaceForCar {
	@Override
	public void CarSecret(){
		System.out.println("BMW Car Sceret");
	}
	
	public void CarEngineScret() {
		System.out.println("BMW Car Engine Sceret");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmwcar = new Bmw();
		bmwcar.CarSecret();
		bmwcar.CarEngineScret();
		
		

	}

	@Override
	public void carcolour() {
		// TODO Auto-generated method stub
		System.out.println("Blue");
		
	}

	@Override
	public void caryearofmanufacture() {
		// TODO Auto-generated method stub
		System.out.println("2021");
	}

	@Override
	public void cartryres() {
		// TODO Auto-generated method stub
		System.out.println("mrf");
		
	}
	

}
