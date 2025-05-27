package main.behavioral.design.pattern.state;

public class OpenGateState implements GateState{

	Gate gate;
	
	@Override
	public void enter() {
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payOk() {
		// let user in
		this.gate.changeState(new CloseGateState());
	}

	@Override
	public void payFailed() {
		// TODO Auto-generated method stub
		
	}

}
