package builder.prototype;

public class TopUsersChache {
	private static final TopUsersChache INSTANCE = new TopUsersChache();

	public static TopUsersChache getInstance() {
		return INSTANCE;
	}

	private TopUsersChache() {
	}

	private TopUsers topUsers = null;

	public TopUsers getTopUsers(int n) {
		if (topUsers == null || n > topUsers.getSize()) {
			topUsers = new MockDAO().getTopUser(n);
			topUsers.setSize(n);
			return topUsers;
		} else {
			try {
				TopUsers tmp = (TopUsers) topUsers.clone();
				tmp.setSize(n);
				return tmp;
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return topUsers;
	}
}
