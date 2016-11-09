package behavior.command;

import behavior.command.Cmd.CmdType;

public class Main {
	public static void main(String[] args) {
		Cmd add = new Cmd(CmdType.ADD, 1);
		Cmd mul = new Cmd(CmdType.MUL, 10);
		Invoker invoker = new Invoker();

		invoker.exec(add);
		invoker.exec(mul);
		invoker.undo(mul);

		invoker.printState();
	}
}
