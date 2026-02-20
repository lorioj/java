package main.behavioral.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
	
	private String news;
	
	private List<Observer> obs = new ArrayList<>();
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		this.obs.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		this.obs.remove(observer);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : obs) {
			o.update(news);
		}
		
	}
	
	public void setNews(String news) {
		this.news = news;
		notifyObserver();
	}
	
	

}
