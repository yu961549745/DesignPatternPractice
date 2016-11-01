package builder.factory.factory_method;

import builder.factory.Car;

public class AudiCarFactory implements CarFactory {
	@Override
	public Car getCar() {
		return new AudiCar();
	}
}
