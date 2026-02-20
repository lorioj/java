package main.behavioral.design.pattern.observer;

public class NewsChannel implements Observer{
	private String channelName;
	
	public NewsChannel(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stu
		System.err.println(this.channelName + " news " + message);
		
	}

}
