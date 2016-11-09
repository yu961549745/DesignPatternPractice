package behavior.command;

public class MulReceiver implements Receiver {
	private int v = 1;

	@Override
	public void exec(Cmd c) {
		v *= c.getValue();
	}

	@Override
	public void undo(Cmd c) {
		v /= c.getValue();
	}

	public int getValue() {
		return v;
	}

}
