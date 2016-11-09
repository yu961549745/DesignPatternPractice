package behavior.command;

public class AddReceiver implements Receiver {
	private int v = 0;

	@Override
	public void exec(Cmd c) {
		v += c.getValue();
	}

	@Override
	public void undo(Cmd c) {
		v -= c.getValue();
	}

	public int getValue() {
		return v;
	}
}
