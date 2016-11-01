package builder.factory.abstract_factory;

public class Main {
	public static void main(String[] args) {
		CarFactory factory = new TrunkFactory();
		Trunk trunk = factory.getTrunk("Benz");
		trunk.load();
		trunk.drive();
	}
}
