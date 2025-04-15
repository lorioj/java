package main.structural.design.pattern.composite;

import java.util.List;

public class Project implements TodoList{
	
	private String title;
	
	private List<TodoList> todos;
	
	public Project(String title, List<TodoList> todos) {
		this.title = title;
		this.todos = todos;
	}
	

	@Override
	public String getHtml() {
		String html = "";
		
		for(TodoList todo : todos) {
//			html = todo.getHtml(); recursive
		}
		
		return html;
	}
	
}
