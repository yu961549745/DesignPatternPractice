package behavior.state;

public enum StateType {
	SLEEP(new SleepState()), GETUP(new GetupState()), EAT(new EatState());

	private State state;

	private StateType(State s) {
		state = s;
	}

	public State getState() {
		return state;
	}

}
