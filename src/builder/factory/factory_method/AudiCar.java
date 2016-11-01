package builder.factory.factory_method;

import builder.factory.Car;

public class AudiCar implements Car {
	@Override
	public void drive() {
		System.out.println("Audi");
	}
}
