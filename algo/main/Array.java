package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
//		System.err.println(Arrays.deepToString(insert(new int[][] {  }, new int[] { 2, 5 })));
//		System.err.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4}, 0)); // output: [[-1, -1, 2], [-1, 0, 1]]
//		System.err.println(fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0)); // output: [[-2, -1, 1, 2], [-2, 0, 0, 2],
//																			// [-1, 0, 0, 1]]

//		System.err.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));

		System.err.println(spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));

	}

	static int maxArea(int[] height) {

		int max = 0;

		int l = 0;
		int r = height.length - 1;

		while (l < r) {

			int w = r - l;
			int h = Math.min(height[l], height[r]);
			max = Math.max(max, w * h);

			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}

		}

		return max;

	}

	static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i - 1] == nums[i]) {
				continue;
			}

			for (int j = i + 1; j < nums.length; j++) {

				if (j > (i + 1) && nums[j] == nums[j - 1]) {
					continue;
				}

				int l = j + 1;
				int k = nums.length - 1;

				while (l < k) {
					long total = nums[i];
					total += nums[j];
					total += nums[l];
					total += nums[k];

					if (target == total) {
						res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[l], nums[k])));
						l++;
						k--;

						while (l < k && nums[k] == nums[k + 1]) {
							k--;
						}

						while (l < k && nums[l] == nums[l - 1]) {
							l++;
						}

					} else if (total < target) {
						l++;
					} else {
						k--;
					}
				}
			}

		}

		return res;
	}

	static List<List<Integer>> threeSum(int[] nums, int target) {
		List<List<Integer>> r = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int total = nums[i] + nums[j] + nums[k];

				if (total > target) {
					k--;
				} else if (total < 0) {
					j++;
				} else {
					r.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
					j++;
					k--;

					while (nums[j] == nums[j - 1] && j < k) {
						j++;
					}

					while (nums[k] == nums[k + 1] && j < k) {
						k--;
					}

				}

			}

		}

		return r;
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
		for (int[] n : ni) {
			if (n[0] != -1) {
				res.add(n);
			}
		}

		return res.toArray(new int[res.size()][]);
	}

	// this topic belongs to matrix
	static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> res = new ArrayList<>();

		int m = matrix.length;
		int n = matrix[0].length;

		int l = 0;
		int r = matrix[0].length - 1;
		int t = 0;
		int b = matrix.length - 1;

		while (res.size() < (m * n)) {

			for (int i = l; i <= r; i++) {
				res.add(matrix[t][i]);

			}
			t++;

			for (int i = t; i <= b; i++) {
				res.add(matrix[i][r]);

			}
			r--;
			for (int i = r; i >= l; i--) {
				res.add(matrix[b][i]);

			}
			b--;

			for (int i = b; i >= t; i--) {
				res.add(matrix[i][l]);

			}
			l++;

		}

		return res;

	}
}
