package struct.functional.proxy;

public class EaterProxy implements Eater {
	private Person p = new Person();

	@Override
	public void eat() {
		System.out.println("检查是否安全");
		p.eat();
	}
}
