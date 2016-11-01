package builder.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockDAO {
	private Random random = new Random();

	public TopUsers getTopUser(int n) {
		List<User> users = new ArrayList<User>();
		for (int k = 0; k < n; k++) {
			User u = new User();
			int id = random.nextInt(100);
			u.setName("u" + id);
			users.add(u);
		}
		return new TopUsers(users);
	}
}
