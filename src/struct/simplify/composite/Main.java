package struct.simplify.composite;

public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode("1");
		TreeNode left = new TreeNode("2");
		TreeNode right = new TreeNode("3");
		root.addChild(left);
		root.addChild(right);
		left.addChild(new TreeNode("4"));
		right.addChild(new TreeNode("5"));

		root.print();
	}
}
