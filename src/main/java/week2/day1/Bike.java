package week2.day1;

public class Bike {

	public static void main(String[] args) {

		Car car = new Car();
		Bike bike = new Bike();
		
		car.applyBreak();
		car.soundHorn();
		
		//bike object cannot call the methods of Car class
	}

}
