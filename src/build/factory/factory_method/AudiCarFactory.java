package build.factory.factory_method;

import build.factory.Car;

public class AudiCarFactory implements CarFactory {
	@Override
	public Car getCar() {
		return new AudiCar();
	}
}
