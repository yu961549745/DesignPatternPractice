package builder.prototype;

import java.util.ArrayList;
import java.util.List;

public class TopUsers implements Cloneable {
	private List<User> users;
	private int size;

	public TopUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users.subList(0, size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new TopUsers(new ArrayList<>(getUsers()));
	}
}
