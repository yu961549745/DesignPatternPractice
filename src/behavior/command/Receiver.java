package behavior.command;

public interface Receiver {
	public void exec(Cmd c);

	public void undo(Cmd c);
	
	public int getValue();
}
