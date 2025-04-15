package main;

import java.util.HashMap;
import java.util.Map;

public class Helper {
	
	private String key;
	
	private Map<String, H> m;
	
	
	class H{
		
		int qnt;
		double total;
		
		public double getT() {
			return qnt * total;
		}
		
		
	}
	
	Helper(){
		this.m = new HashMap<>();
	}
	
	public void setm(String k, H o) {
		m.put(k, o);
	}
	
	public Object getm(String k) {
		return this.m.get(k);
	}
	
	
	public double getT(String k) {
		if(m.containsKey(k)) {
			return m.get(k).getT();
//			return m.get(k);
		}
		
		return 0;
	}
	
	
	public void setTotal(String k, double t) {
		if(m.containsKey(k)) {
			H h = m.get(k);
			h.total = t;
			m.put(k, h);
			
		}else {
			//log 
		}
	}
	

}
