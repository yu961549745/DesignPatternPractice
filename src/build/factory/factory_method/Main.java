package build.factory.factory_method;

import build.factory.Car;

public class Main {
	public static void main(String[] args) {
		CarFactory factory = new BmwCarFactory();
		Car car = factory.getCar();
		car.drive();
	}
}
