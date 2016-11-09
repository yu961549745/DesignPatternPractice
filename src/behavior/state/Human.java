package behavior.state;

public class Human {
	private String name;
	private StateType stateType = StateType.SLEEP;

	public Human(String name) {
		this.name = name;
	}

	public void update() {
		stateType.getState().exec(this);
	}

	public void setStateType(StateType stateType) {
		this.stateType = stateType;
	}

	@Override
	public String toString() {
		return name;
	}
}
