package main.codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BinaryGap {
	
	public static void main(String[] args) {
		BinaryGap bg = new BinaryGap();
		int n = 253;
		System.out.println(bg.solution(n));
		
		System.out.println(bg.solutions(n));
		
		Set<Integer> s = new HashSet<>();
		
		List<Integer> l = new ArrayList<>();
		System.out.println(4 ^ 3);
		
		
		
	}
	
	public int solution(int n) {
		int res = 0;
		
		String bin = Integer.toBinaryString(n);
		int c = 0;
		boolean isStarted = false;
		
		for(int i = 0; i < bin.length(); i++) {
			if(bin.charAt(i) == '1') {
				if(isStarted) {
					if(c > res) {
						res = c;
					}
				}
				c = 0;
				isStarted = true;
			}else {
				c++;
			}
		}
		
		return res;
	}
	
	
	public int solutions(int N) {
	    String binaryString = Integer.toBinaryString(N);
	   
	    int longestBinaryGap = 0;
	    List<Integer> onesList = new ArrayList();
	   
	    for(int i=0; i<binaryString.length(); i++) {
	      if(binaryString.charAt(i) == '0') continue;
	      onesList.add(i);
	    }

	    for(int i=0; i<onesList.size() - 1; i++) {
	      //subtract 1 so that don't count 1's next to each other as having any gap
	      int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;
	     
	      longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
	    }
	    return longestBinaryGap;
	  }
	

}
