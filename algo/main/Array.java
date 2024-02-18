package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		System.err.println(Arrays.deepToString(insert(new int[][] {  }, new int[] { 2, 5 })));
	}

	static int[][] insert(int[][] intervals, int[] newInterval) {
		
	
		int[][] ni = new int[intervals.length + 1][2];

		for (int i = 0; i < intervals.length; i++) {
			for (int j = 0; j < intervals[i].length; j++) {
				ni[i][j] = intervals[i][j];
			}
		}
		ni[intervals.length][0] = newInterval[0];
		ni[intervals.length][1] = newInterval[1];
		Arrays.sort(ni, (a, b) -> a[0] - b[0]);

		for (int i = 1; i < ni.length; i++) {
			if (ni[i][0] < ni[i - 1][1]) {
				ni[i][0] = ni[i - 1][0];
				ni[i][1] = Math.max(ni[i - 1][1], ni[i][1]);

				ni[i - 1][0] = -1;
			}
		}
		
		List<int[]> res = new ArrayList<>();
		for(int[] n : ni) {
			if(n[0] != -1) {
				res.add(n);
			}
		}

		return res.toArray(new int[res.size()][]);
	}

}
