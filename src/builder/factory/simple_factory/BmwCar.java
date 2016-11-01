package builder.factory.simple_factory;

import builder.factory.Car;

public class BmwCar implements Car {
	@Override
	public void drive() {
		System.out.println("BMW");
	}
}
