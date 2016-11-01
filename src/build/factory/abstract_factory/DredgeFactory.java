package build.factory.abstract_factory;

public class DredgeFactory implements CarFactory {

	@Override
	public Trunk getTrunk(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Dredge getDredge(String name) {
		if (name.equals("San")) {
			return new SanDredge();
		} else if (name.equals("Yiqi")) {
			return new YiqiDredge();
		} else {
			throw new IllegalArgumentException();
		}
	}

}
