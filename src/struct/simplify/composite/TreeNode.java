package struct.simplify.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String name;
	private List<TreeNode> childs = new ArrayList<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public List<TreeNode> getChilds() {
		return childs;
	}

	public void addChild(TreeNode node) {
		this.childs.add(node);
	}

	public void print() {
		System.out.println(name + ":" + getChilds());
		for (TreeNode t : childs) {
			t.print();
		}
	}

	@Override
	public String toString() {
		return name;
	}
}
