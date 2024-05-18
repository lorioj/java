package main;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] ar = new int[] { 2, 3, 1, 2, 4, 3 };

		System.err.println(minSubArrayLen(7, ar));
		System.err.println(ms(ar, 7));

		System.err.println(lengthOfLongestSubstring("abcdaid"));

	}

	static int lengthOfLongestSubstring(String s) {

		int max = 0;
		int l = 0;
		Set<Character> set = new HashSet<>();

		for (int r = 0; r < s.length(); r++) {
			while (set.contains(s.charAt(r))) {
				set.remove(s.charAt(l));
				l++;
			}

			set.add(s.charAt(r));
			max = Math.max(max, r - l + 1);

		}

		return max;

	}

	static int ms(int[] arr, int t) {

		int min = Integer.MAX_VALUE;
		int l = 0;

		int sum = 0;
		for (int r = 0; r < arr.length; r++) {
			sum += arr[r];
			while (sum >= t) {
				sum -= arr[l];
				min = Math.min(min, r - l + 1);
				l++;
			}

		}

		if (min == Integer.MAX_VALUE) {
			return 0;
		}

		return min;

	}

	static int minSubArrayLen(int target, int[] nums) {

		int min = Integer.MAX_VALUE;
		int l = 0;
		int cur = 0;

		for (int r = 0; r < nums.length; r++) {
			cur += nums[r];
			while (cur >= target) {
				cur -= nums[l];
				min = Math.min(min, r - l + 1);
				l++;
			}
		}
		if (min == Integer.MAX_VALUE) {
			return 0;
		}

		return min;

	}

}
