package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicProgramming {

	public static void main(String[] args) {
//		System.err.println(bestSum(7, new int[] { 1, 3, 4, 5, 7 }));
//		int[] arr = new int[3];
//		System.err.println(Arrays.toString(arr));
//		System.err.println(fibTabulation(3));
//		System.err.println(coinChange(new int[] { 1, 2, 5, }, 11));
//		System.err.println(uniquePaths(3, 7));
//		System.err.println(up(3,7));
//		System.err.println(ups(3, 7));
//		System.err.println(hos(7, new int[] {2,3,4,5}));
//		System.err.println(hs(8, new int[] {3,4, 2}));

//		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//		Output: 6
//		Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//		System.err.println(maxSubArray2(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//		System.err.println(pr(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
//		System.err.println(pr(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 })); // why result is 7

//		System.err.println(canPartition(new int[] { 2, 5, 11, 5 }));
//		System.err.println(targetSumList(new int[] { 1, 3, 5 }, 6)); // should return [0, 1, 5]

//		System.err.println(canConstructRecursion("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaf", new String[] {"a" ,"aa"}, new HashMap<>()));

//		System.err.println(canConstruct("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd" })); // should return true
//		System.err.println(canConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"})); // result should false

//		System.err.println(countConstruct("purple", new String[] { "purp", "p", "ur", "le", "purl" })); // should return 2

//		System.err.println(howConstruct("purple", new String[] {"purp", "p", "ur", "le", "purl	"}));
//		System.err.println(howConstruct("abcd", new String[] { "a", "b", "c", "d" })); 

//		System.err.println(allConstruct("purple", new String[] { "purp", "p", "ur", "le", "purl	" }));
//		System.err.println(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas", new String[] {"as" ,"aa"}, new HashMap<>()));

	}

	static List<Integer> howSum(int t, int[] nums) {
		if (t == 0) {
			return new ArrayList<>();
		}
		if (t < 0) {
			return null;
		}

		for (int n : nums) {
			int rem = t - n;
			List<Integer> remRes = howSum(rem, nums);
			if (remRes != null) {
				List<Integer> res = new ArrayList<>(remRes);
				res.add(n);
				return res;
			}
		}

		return null;

	}

//	use memoization(hashmap)
	static List<Integer> bestSum(int t, int[] nums, Map<Integer, List<Integer>> map) {

		if (map.containsKey(t)) {
			return map.get(t);
		}
		if (t == 0) {
			return new ArrayList<>();
		}

		if (t < 0) {
			return null;
		}

		List<Integer> shortestCombination = null;

		for (int n : nums) {
			int remainder = t - n;
			List<Integer> remResult = bestSum(remainder, nums, map);
			if (remResult != null) {
				List<Integer> res = new ArrayList<>(remResult);
				res.add(n);

				if (shortestCombination == null || res.size() < shortestCombination.size()) {
					shortestCombination = res;
				}

			}

		}
		map.put(t, shortestCombination);
		return map.get(t);
	}

	// howsum tabulatoin hashamp
	static List<Integer> howSumT(int t, int[] nums) {
		Map<Integer, List<Integer>> m = new HashMap<>();

		for (int i = 0; i <= t; i++) {
			m.put(i, null);
		}
		m.put(0, new ArrayList<>());

		for (int i = 0; i <= t; i++) {
			if (m.get(i) != null) {
				for (int n : nums) {
					int key = i + n;
					if (i + n < m.size()) {
						List<Integer> l = new ArrayList<>(m.get(i));
						l.add(n);
						m.put(key, l);
					}
				}
			}
		}

		return m.get(t);

	}

//	 how sum tabulation list implementation
	static List<Integer> howSumTabulationMyVersion(int t, int[] nums) {
		List<Integer>[] table = new List[t + 1];
		for (int i = 0; i <= t; i++) {
			table[i] = null;
		}
		table[0] = new ArrayList<>();

		for (int i = 0; i <= t; i++) {
			if (table[i] != null) {
				for (int n : nums) {
					int idx = i + n;
					if (idx < table.length) {
						table[idx] = new ArrayList<>(table[i]);
						table[idx].add(n);
					}
				}
			}
		}

		return table[t];
	}

	static List<Integer> bestSumTabulation(int t, int[] nums) {
		List<Integer>[] tables = new List[t + 1];
		for (int i = 0; i <= t; i++) {
			tables[i] = null;
		}
		tables[0] = new ArrayList<>();

		for (int i = 0; i <= t; i++) {
			if (tables[i] != null) {
				for (int n : nums) {
					int key = i + n;
					if (key < tables.length) {

						List<Integer> combination = new ArrayList<>(tables[i]);
						combination.add(n);

						if (tables[i + n] == null || tables[i + n].size() > combination.size()) {
							tables[i + n] = combination;
						}

					}

				}
			}
		}

		return tables[t];
	}

//	recursive dp
	static int[] canSum(int target, int[] arr) {

		if (target == 0) {
			return new int[] {};
		}
		if (target < 0) {
			return null;
		}

		for (int num : arr) {
			int rem = target - num;

			int[] remRes = canSum(rem, arr);
			if (remRes != null) {
				int[] r = new int[remRes.length + 1];
				for (int i = 0; i < remRes.length; i++) {
					r[i] = remRes[i];
				}
				r[remRes.length] = num;
				return r;
			}
		}

		return null;
	}

	static int coinChange(int[] coins, int amount) { // working solution
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1); // set the value max to the amount
		dp[0] = 0;

		for (int i = 1; i < amount + 1; i++) {
			for (int coin : coins) {
				if (i - coin >= 0) {
					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}

	// cc coinChange
	static int cc(int amount, int[] coins) { // working solution i repeat

		int[] tables = new int[amount + 1];

		for (int i = 0; i < tables.length; i++) {
			tables[i] = amount + 1;
		}
		tables[0] = 0;

		for (int i = 1; i < tables.length; i++) {
			for (int c : coins) {
				if (i - c >= 0) {
					tables[i] = Math.min(tables[i], tables[i - c] + 1);
				}
			}
		}

		return tables[amount] < amount + 1 ? tables[amount] : -1;

	}

	static int fibTabulation(int n) {
		int[] t = new int[n + 1];
		t[1] = 1;

		for (int i = 0; i < t.length; i++) {
			if (i + 1 < t.length) {
				t[i + 1] += t[i];
			}

			if (i + 2 < t.length) {
				t[i + 2] = t[i];
			}
		}

		return t[n];
	}

//	Input: m = 3, n = 2
//	Output: 3
//	Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//	1. Right -> Down -> Down
//	2. Down -> Down -> Right
//	3. Down -> Right -> Down

	static int uniquePaths(int m, int n) {
		int table[] = new int[n];
		for (int i = 0; i < n; i++) {
			table[i] = 1;
		}
		for (int j = 0; j < m - 1; j++) {
			for (int i = 1; i < n; i++) {
				table[i] = table[i] + table[i - 1];
			}
			System.err.println(Arrays.toString(table));
		}

		return table[n - 1];
	}

	static int ups(int m, int n) {
		int[][] t = new int[m][n];

		for (int i = 0; i < m; i++) { // initialized cols 0 idx
			t[i][0] = 1;
		}
//		
		for (int i = 0; i < n; i++) { // initialized 0 rows
			t[0][i] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				t[i][j] = t[i - 1][j] + t[i][j - 1];
			}
		}

		return t[m - 1][n - 1];
	}

	static List<Integer> hos(int t, int[] coin) {
		List<Integer>[] l = new List[t + 1];

		for (int i = 0; i < l.length; i++) {
			l[i] = null;
		}

		l[0] = new ArrayList<>();

		for (int i = 0; i < l.length; i++) {
			if (l[i] != null) {
				for (int c : coin) {
					List<Integer> cur = new ArrayList<>(l[i]);
					cur.add(c);
					if (i + c < l.length) {
						l[i + c] = cur;
					}

				}
			}
		}

		return l[t];

	}

	// howSum dynamic programming
	static List<Integer> hs(int t, int[] coins) {
		if (t == 0) {
			return new ArrayList<>();
		}
		if (t < 0) {
			return null;
		}

		for (int c : coins) {
			int rem = t - c;
			List<Integer> remR = hs(rem, coins);
			if (remR != null) {
				List<Integer> res = new ArrayList<>(remR);
				res.add(c);

				return res;

			}
		}

		return null;

	}

	// look like sliding window -- kadane algoritht was applied
	static int pr(int[] arr) {
		int max = arr[0];
		int curSum = 0;

		for (int n : arr) {
			if (curSum < 0) {
				curSum = 0;
			}
			curSum += n;
			max = Math.max(max, curSum);
		}

		return max;
	}

//	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//	Output: 6
//	Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//	use kadane algo
	static int maxSubArray(int[] nums) {
		int max = nums[0];
		int maxSoFar = nums[0];

		for (int i = 1; i < nums.length; i++) {
			maxSoFar = Math.max(maxSoFar + nums[i], nums[i]);
			max = Math.max(max, maxSoFar);
		}

		return max;
	}

//	ues tables
	static int maxSubArray2(int[] nums) {
		int idxwmax = 0;
		int[] t = new int[nums.length];
		t[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			t[i] = Math.max(t[i - 1] + nums[i], nums[i]);
		}

		System.err.println(Arrays.toString(t));
		return t[idxwmax];
	}

//	PARTITION EQUAL SUBSET SUM

	static boolean targetSum(int[] nums, int target) {
		int n = nums.length;
		boolean[][] table = new boolean[n + 1][target + 1];
		for (int i = 0; i < n + 1; i++) {
			table[i][0] = true;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < target + 1; j++) {
				if (table[i - 1][j]) {
					table[i][j] = true;
				} else if (nums[i - 1] <= j && table[i - 1][j - nums[i - 1]]) {
					table[i][j] = true;
				}
			}
		}
		return table[n][target];
	}

//	Input: nums = [1,5,11,5]
//	Output: true
//	Explanation: The array can be partitioned as [1, 5, 5] and [11].
	static boolean canPartition(int[] nums) {
		int n = nums.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums[i];
		}
		if (sum % 2 != 0) {
			return false;
		}
		int target = sum / 2;
		return targetSum(nums, target);
	}

//	END

	static List<Integer> targetSumList(int[] nums, int t) {
		List<Integer>[][] table = new List[nums.length + 1][t + 1];

		for (int i = 0; i < nums.length + 1; i++) {
			table[i][0] = new ArrayList<>(Arrays.asList(0));
		}

		for (int i = 1; i < nums.length + 1; i++) {
			for (int j = 1; j < t + 1; j++) {
				if (table[i - 1][j] != null) {
					List<Integer> e = new ArrayList<>(table[i - 1][j]);
					table[i][j] = e;
				} else if (nums[i - 1] <= j && table[i - 1][j - nums[i - 1]] != null) {
					List<Integer> e = new ArrayList<>(table[i - 1][j - nums[i - 1]]);
					e.add(nums[i - 1]);
					table[i][j] = e;
				}
			}
		}

		for (List<Integer>[] l : table) {
			System.err.println(Arrays.toString(l));
		}
		return table[nums.length - 1][t];
	}

//	CONSTRUCT

	public static boolean canConstruct(String target, String[] words) {
		boolean[] table = new boolean[target.length() + 1];
		table[0] = true; // base case

		for (int i = 0; i <= target.length(); i++) {
			if (table[i]) {
				for (String word : words) {
					if (i + word.length() <= target.length() && target.substring(i, i + word.length()).equals(word)) {
						table[i + word.length()] = true;
					}
				}
			}
		}

		return table[target.length()];
	}

	static int countConstruct(String target, String[] wordBank) {

		if (target.equals("")) {
			return 1;
		}
		int totalCount = 0;
		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String suffix = target.substring(word.length());
				totalCount += countConstruct(suffix, wordBank);

			}

		}

		return totalCount;
	}

	static boolean canConstructRecursion(String target, String[] words, HashMap<String, Boolean> memo) {
		if (memo.containsKey(target)) {
			return memo.get(target);
		}
		if (target.equals("")) {
			return true;
		}

		for (String w : words) {
			if (target.startsWith(w)) {
				String suffix = target.substring(w.length());
				if (canConstructRecursion(suffix, words, memo)) {
					memo.put(target, true);
					return true;
				}
			}
		}
		memo.put(target, false);
		return false;
	}

//	find any mathces to tartget
	static List<String> howConstruct(String target, String[] words) {

		if (target.equals("")) {
			return new ArrayList<>();
		}

		for (String w : words) {
			if (target.startsWith(w)) {
				String suffix = target.substring(w.length());
				List<String> suffixResult = howConstruct(suffix, words);
				List<String> res = new ArrayList<>();
				res.add(w);
				res.addAll(suffixResult);
				return res;

			}
		}
		return null;
	}

//	find all possible combination of target

	public static List<List<String>> allConstruct(String target, String[] wordBank) {
		if (target.equals(""))
			return Arrays.asList(new ArrayList<>());

		List<List<String>> result = new ArrayList<>();
		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String suffix = target.substring(word.length());
				List<List<String>> suffixWays = allConstruct(suffix, wordBank);
				for (List<String> ways : suffixWays) {
					List<String> targetWays = new ArrayList<>();
					targetWays.add(word);
					targetWays.addAll(ways);
					result.add(targetWays);
				}
			}
		}
		return result;
	}

	public static List<List<String>> allConstruct(String target, String[] wordBank,
			Map<String, List<List<String>>> memo) {
		if (memo.containsKey(target))
			return memo.get(target);

		if (target.equals("")) {
			List<List<String>> baseResult = new ArrayList<>(); // this is important
			baseResult.add(new ArrayList<>());
			return baseResult;
		}
		List<List<String>> result = new ArrayList<>();
		for (String word : wordBank) {
			if (target.startsWith(word)) {
				String suffix = target.substring(word.length());
				List<List<String>> suffixWays = allConstruct(suffix, wordBank, memo);
				for (List<String> way : suffixWays) {
					List<String> targetWay = new ArrayList<>();
					targetWay.add(word);
					targetWay.addAll(way);
					result.add(targetWay);
				}
			}
		}
		memo.put(target, result);
		return result;
	}

//	END OF CONSTRUCT

}
