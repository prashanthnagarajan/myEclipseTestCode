package abstraction;

public abstract class Car {
	
	
	//If only first two methods are only there in the class then it would have been 100 
	//percentage of Abstraction But there are two methods which have impementation for 
	//them so now it only 50 % of abstraction
	public abstract void CarSecret();
	public abstract void CarEngineScret(); 
	
	//public abstract void Carsales2022() ;
	
	
	public void Carsales2021() {
		System.out.println("70 cars for 2021");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Car car = new Car();
		//car.CarEngineScret();
		//car.CarSecret();
	}

}
