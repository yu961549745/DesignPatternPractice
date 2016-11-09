package behavior.command;

import java.util.HashMap;
import java.util.Map;
import behavior.command.Cmd.CmdType;

public class Invoker {
	private Map<CmdType, Receiver> map = new HashMap<>();

	public Invoker() {
		map.put(CmdType.ADD, new AddReceiver());
		map.put(CmdType.MUL, new MulReceiver());
	}

	public void exec(Cmd c) {
		map.get(c.getType()).exec(c);
	}

	public void undo(Cmd c) {
		map.get(c.getType()).undo(c);
	}

	public void printState() {
		System.out.println("sum  ->" + map.get(CmdType.ADD).getValue());
		System.out.println("prod ->" + map.get(CmdType.MUL).getValue());
	}
}
