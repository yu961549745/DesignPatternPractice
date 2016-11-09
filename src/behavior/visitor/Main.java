package behavior.visitor;

public class Main {
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		FruitVisitor visitor = new Eater();
		apple.accept(visitor);
		orange.accept(visitor);
	}
}
