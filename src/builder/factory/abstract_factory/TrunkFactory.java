package builder.factory.abstract_factory;

public class TrunkFactory implements CarFactory {

	@Override
	public Trunk getTrunk(String name) {
		if (name.equals("Benz")) {
			return new BenzTrunk();
		} else if (name.equals("Yiqi")) {
			return new YiqiTrunk();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Dredge getDredge(String name) {
		throw new UnsupportedOperationException();
	}

}
