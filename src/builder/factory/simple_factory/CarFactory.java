package builder.factory.simple_factory;

import builder.factory.Car;

public class CarFactory {
	public static Car getCar(String name) {
		if (name.equals("bmw")) {
			return new BmwCar();
		} else if (name.equals("audi")) {
			return new AudiCar();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
