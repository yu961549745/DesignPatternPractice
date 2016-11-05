package struct.functional.proxy;

public class Main {
	public static void main(String[] args) {
		Eater e = new EaterProxy();
		e.eat();
	}
}
