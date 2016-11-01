package build.factory.simple_factory;

import build.factory.Car;

public class Main {
	public static void main(String[] args) {
		Car c = CarFactory.getCar("bmw");
		c.drive();
	}
}
