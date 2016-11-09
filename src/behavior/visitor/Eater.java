package behavior.visitor;

public class Eater implements FruitVisitor {

	@Override
	public void visit(Fruit f) {
		System.out.println(f + "真好吃");
	}

}
