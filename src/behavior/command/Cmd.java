package behavior.command;

public class Cmd {
	public static enum CmdType {
		ADD, MUL;
	}

	private CmdType type;
	private int value;

	public Cmd(CmdType type, int value) {
		this.type = type;
		this.value = value;
	}

	public CmdType getType() {
		return type;
	}

	public int getValue() {
		return value;
	}
}
