package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShiftHeader {
	private List<Sample> l;
	
	public ShiftHeader() {
		l = new ArrayList<>();
		l.add(new Sample("test", 10));
		
	}
	
	
	class Sample{
		String name;
		int value;
		
		Sample(String name, int value) {
			this.name = name;
			this.value = value;
		}
	}
	
	public void init(String k, Map<String, Integer> map) {
		if(!map.containsKey(k)) {
			map.put(k, 100);
		}
	}
	
	public void compute() {
		
		Map<String, Integer> m1 = new HashMap<>();
		Map<String, Integer> m2 = new HashMap<>();
		Map<String, Integer> m3 = new HashMap<>();
		Map<String, Integer> m4 = new HashMap<>();
		Map<String, Integer> m5 = new HashMap<>();
		
		
		
		init("sd ", m1);
		
		for(Sample i : l) {	
			init(i.name, m1);
		}
		
		System.err.println(m1);
		
		
		
	}
}
