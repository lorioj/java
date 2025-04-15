package main.codility;

public class PermMissingElem {
	
	
	public static void main(String[] args) {
		
		PermMissingElem p = new PermMissingElem();
		System.out.println(p.missingNumber(new int[] {1,2,3,5})); // expected output should be 4
	
	}
	public int missingNumber(int[] nums) {
	    int sum = 0, num, n = nums.length;
	    
	    for(int i = 0; i < nums.length; i++){
	        sum += nums[i];
	    }

	    num = ((n + 1) * (n + 2)) / 2 - sum; 

	    return num;
	}
	
	public int missing(int[] nums) {
		int res = 0;
		
		
		for(int i = 0; i < nums.length + 1; i++) {
			
		}

		return res;
	}
	
	
}
