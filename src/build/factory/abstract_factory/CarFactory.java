package build.factory.abstract_factory;

public interface CarFactory {
	public Trunk getTrunk(String name);

	public Dredge getDredge(String name);
}
