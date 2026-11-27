package code.abstraction_Polymorphism;

abstract class Car {

	void start() {
		System.out.println("Car.start()");
	}

	abstract void accelerate();

	abstract void brake();
}

class ElectricCar extends Car {

	@Override
	void accelerate() {
		System.out.println("ElectricCar.accelerate()");

	}

	@Override
	void brake() {
		System.out.println("ElectricCar.brake()");

	}

}

class FuleCar extends Car {

	@Override
	void accelerate() {
		System.out.println("FuleCar.accelerate()");

	}

	@Override
	void brake() {
		System.out.println("FuleCar.brake()");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {

		System.out.println("Fule Car");
		Car car1 = new FuleCar(); // upcasting
		car1.start();
		car1.accelerate();
		car1.brake();
		
		System.out.println("\nElectric Car");
		Car car2 = new ElectricCar(); // upcasting
		car2.start();
		car2.accelerate();
		car2.brake();

	}

}
