package builder.factory.factory_method;

import builder.factory.Car;

public class BmwCarFactory implements CarFactory {
	@Override
	public Car getCar() {
		return new BmwCar();
	}
}
