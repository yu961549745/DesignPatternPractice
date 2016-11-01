package build.factory.factory_method;

import build.factory.Car;

public class BmwCarFactory implements CarFactory {
	@Override
	public Car getCar() {
		return new BmwCar();
	}
}
