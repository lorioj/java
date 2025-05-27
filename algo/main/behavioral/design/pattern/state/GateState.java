package main.behavioral.design.pattern.state;

public interface GateState {

	void enter();

	void pay();

	void payOk();

	void payFailed();

}
