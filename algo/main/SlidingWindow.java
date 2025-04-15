package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SlidingWindow {

	public static void main(String[] args) {
//		int[] ar = new int[] { 2, 3, 1, 2, 4, 3 };
//
//		System.err.println(minSubArrayLen(7, ar));
//		System.err.println(ms(ar, 7));
//
//		System.err.println(lengthOfLongestSubstring("abcdaid"));

		System.err.println(countGoodSubstrings("owuxoelszb")); // ouput 8

	}

	// easy

	static String longestNiceSubstring(String s) {
		String res = "";
		char[] chars = s.toCharArray();

		int l = 0;

		for (int r = 0; r < s.length(); r++) {
			if (Character.isUpperCase(chars[r])) {

			} else {

			}
		}

		return res;
	}

	static int countGoodSubstrings(String s) {
		int n = s.length();

		int ans = 0;

		for (int i = 0; i < n - 2; i++) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(i + 1);
			char ch3 = s.charAt(i + 2);

			if (ch1 != ch2 && ch1 != ch3 && ch2 != ch3)
				ans++;
		}
		return ans;
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

				l++;
			}
			min = Math.min(min, r - l + 1);

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

	/**
	 * nput: nums = [1,12,-5,-6,50,3], k = 4 Output: 12.75000 Explanation: Maximum
	 * average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	static double findMaxAverage(int[] nums, int k) {

		double max = Double.NEGATIVE_INFINITY;
		int sum = 0;
		int l = 0;

		for (int r = 0; r < nums.length; r++) {
			sum += nums[r];
			if (r >= k - 1) {
				double avg = (double) sum / k;
				max = Math.max(max, avg);
				sum -= nums[l];
				l++;
			}

		}

		return max;

	}

	// medium problem

	static int longestSubstring(String s, int k) {

		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		boolean valid = true;

		StringBuilder sb = new StringBuilder();

		for (char key : map.keySet()) {
			if (map.get(key) < k) {
				valid = false;
				sb.append(key);
			}
		}
		if (valid) {
			return s.length();
		}

		for (char c : sb.toString().toCharArray()) {
			s = s.replace(c, ' ');
		}

		String[] arr = s.split(" ");

		int ans = 0;
		for (String str : arr) {
			ans = Math.max(ans, longestSubstring(str, k));
		}

		return ans;

	}

	static boolean checkInclusion(String s1, String s2) {
		return false;
	}

}
