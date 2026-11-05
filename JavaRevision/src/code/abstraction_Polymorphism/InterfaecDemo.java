package code.abstraction_Polymorphism;

interface CarInfo {
	void start();

	void accelerate();

	void brake();
}

class FuleCar2 implements CarInfo {

	@Override
	public void start() {
		System.out.println("InterfaecDemo.FuleCar2.start()");

	}

	@Override
	public void accelerate() {
		System.out.println("InterfaecDemo.FuleCar2.accelerate()");

	}

	@Override
	public void brake() {
		System.out.println("InterfaecDemo.FuleCar2.brake()");

	}
}

class ElectricCar2 implements CarInfo {

	@Override
	public void start() {
		System.out.println("InterfaecDemo.ElectricCar2.start()");

	}

	@Override
	public void accelerate() {
		System.out.println("InterfaecDemo.ElectricCar2.accelerate()");

	}

	@Override
	public void brake() {
		System.out.println("InterfaecDemo.ElectricCar2.brake()");

	}
}

public class InterfaecDemo {
	public static void main(String[] args) {

		CarInfo newCar = new ElectricCar2();
		newCar.start();
		newCar.accelerate();
		newCar.brake();

	}
}
