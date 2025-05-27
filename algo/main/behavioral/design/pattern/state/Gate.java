package main.behavioral.design.pattern.state;

public class Gate {
	
	GateState state;

	public Gate() {
		this.state = new CloseGateState(); //initial 
	}

	public void changeState(GateState state) {
		this.state = state;
	}
	
	public void payOk() {
		this.state.payOk();
	}
	
	public void payFailed() {
		this.state.payFailed();
	}

}
