package build.factory.factory_method;

import build.factory.Car;

public class BmwCar implements Car {
	@Override
	public void drive() {
		System.out.println("BMW");
	}
}
