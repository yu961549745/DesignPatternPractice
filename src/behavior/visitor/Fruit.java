package behavior.visitor;

public abstract class Fruit {
	public void accept(FruitVisitor v) {
		v.visit(this);
	}
}
