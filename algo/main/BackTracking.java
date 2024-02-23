package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Backtracking concept 1, choice 2, constrainst 3, goals
 * 
 * @author Admin
 *
 */

public class BackTracking {

	public static void main(String[] args) {

//		char[][] board = new char[][] { 
//		{ 'A', 'B', 'C', 'E' }, 
//		{ 'S', 'F', 'C', 'S' }, 
//		{ 'A', 'D', 'E', 'E' } };
//		System.err.println(exist(board, "ABCD"));

//		System.err.println(subsets(new int[] { 1, 2, 3 })); // result: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]

//		System.err.println(letterCombinations("23")); // result: [ad, ae, af, bd, be, bf, cd, ce, cf]

//		Input: nums = [1,2,3]
//		Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//		System.err.println(permute(new int[] { 1, 2, 3 }));

//		Input: candidates = [2,3,5], target = 8
//		Output: [[2,2,2,2],[2,3,3],[3,5]]
//		System.err.println(combinationSum(new int[] { 2, 3, 5 }, 8));

//		Input: n = 3
//		Output: ["((()))","(()())","(())()","()(())","()()()"]
//		System.err.println(generateParenthesis(3));

		int[][] board = { { 1, 0, 0, 0 }, { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		int[][] sol = new int[board.length][board.length];
		System.err.println(maze(board, sol, 0, 0));

	}

//	EASY P
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		binary(root, res, new ArrayList<>());
		return res;
	}

	static void binary(TreeNode root, List<String> res, List<Integer> tmp) {
		if (root == null) {
			return;
		}

		tmp.add(root.val);

		if (root.left == null && root.right == null) {
			StringBuilder a = new StringBuilder();
			for (int i = 0; i < tmp.size() - 1; i++) {
				a.append(tmp.get(i)).append("->");
			}
			a.append(tmp.get(tmp.size() - 1));
			res.add(a.toString());
		}

		binary(root.left, res, tmp);
		binary(root.right, res, tmp);

		tmp.remove(tmp.size() - 1);

	}

//	END OF EASY P

//	MEDIUM P
	static boolean exist(char[][] board, String word) {
		boolean[][] visited = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && found(board, i, j, word, 0, visited)) {
					return true;
				}
			}
		}
		return false;

	}

	static boolean found(char[][] board, int i, int j, String word, int idx, boolean[][] visited) {
		if (idx == word.length()) {
			return true;
		}

		if (i < 0 || j < 0 || i == board.length || j == board[i].length || word.charAt(idx) != board[i][j]
				|| visited[i][j] == true) {
			return false;
		}

		visited[i][j] = true;

		if (found(board, i + 1, j, word, idx + 1, visited) || found(board, i - 1, j, word, idx + 1, visited)
				|| found(board, i, j + 1, word, idx + 1, visited) || found(board, i, j - 1, word, idx + 1, visited)

		) {
			return true;
		}
		visited[i][j] = false;

		return false;

	}

	static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		subsets(res, new ArrayList<>(), nums, 0);
		return res;
	}

	static void subsets(List<List<Integer>> res, List<Integer> tmp, int[] nums, int idx) {
		res.add(new ArrayList<>(tmp));
		for (int i = idx; i < nums.length; i++) {
			tmp.add(nums[i]);
			subsets(res, tmp, nums, i + 1);
			tmp.remove(tmp.size() - 1);
		}
	}

//	Letter Combination of a Phone Number
	static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		if (digits.equals("")) {
			return res;
		}
//		can use map or array -> is good
		Map<Integer, String[]> map = new HashMap<>();
		map.put(2, new String[] { "a", "b", "c" });
		map.put(3, new String[] { "d", "e", "f" });
		map.put(4, new String[] { "g", "h", "i" });
		map.put(5, new String[] { "j", "k", "l" });
		map.put(6, new String[] { "m", "n", "o" });
		map.put(7, new String[] { "p", "q", "r", "s" });
		map.put(8, new String[] { "t", "u", "v" });
		map.put(9, new String[] { "w", "x", "y", "z" });

//		letterCombinations("", digits, map, res);
		letterCombinations(digits, "", res, map, 0);
		return res;

	}

	/**
	 * Use suffix strategy
	 * 
	 * @param combination
	 * @param digitsSuffix
	 * @param m
	 * @param res
	 */
	static void letterCombinations(String combination, String digitsSuffix, Map<Integer, String[]> m,
			List<String> res) {
		if (digitsSuffix.equals("")) {
			res.add(combination);
			return;
		}

		String[] strs = m.get(digitsSuffix.charAt(0) - '0');
		for (String s : strs) {
			letterCombinations(combination + s, digitsSuffix.substring(1), m, res);
		}

	}

	/**
	 * Use the index strategy
	 * 
	 * @param d
	 * @param c
	 * @param res
	 * @param mapping
	 * @param idx
	 */
	static void letterCombinations(String d, String c, List<String> res, Map<Integer, String[]> mapping, int idx) {
		if (idx == d.length()) {
			res.add(c);
			return;
		}

		String[] maps = mapping.get(d.charAt(idx) - '0');
		System.err.println(Arrays.toString(maps));
		System.err.println(idx);
		for (String s : maps) {
			letterCombinations(d, c + s, res, mapping, idx + 1);
		}

	}

	static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		permute(nums, res, new ArrayList<>());

		return res;
	}

	static void permute(int[] nums, List<List<Integer>> res, List<Integer> tmp) {

		if (tmp.size() == nums.length) {
			res.add(new ArrayList<>(tmp));
			return;
		}

		for (int n : nums) {
			if (tmp.contains(n)) {
				continue;
			}
			tmp.add(n);
			permute(nums, res, tmp);
			tmp.remove(tmp.size() - 1);
		}

	}

	static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> r = new ArrayList<>();
		combinationSum(candidates, target, r, new ArrayList<>(), 0);
		return r;
	}

	static void combinationSum(int[] candidates, int target, List<List<Integer>> res, List<Integer> tmp, int idx) {
		if (target == 0) {
			res.add(new ArrayList<>(tmp));
			return;
		}
		if (target < 0) {
			return;
		}

		for (int i = idx; i < candidates.length; i++) {
			tmp.add(candidates[i]);
			combinationSum(candidates, target - candidates[i], res, tmp, i);
			tmp.remove(tmp.size() - 1);

		}

	}

	static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		generateParenthesis(n, "", res, 0, 0);
		return res;
	}

	static void generateParenthesis(int n, String s, List<String> res, int open, int close) {
		if (s.length() == n * 2) {
			res.add(s);
			return;
		}

		if (open < n) {
			generateParenthesis(n, s + "(", res, open + 1, close);
		}

		if (close < open) {
			generateParenthesis(n, s + ")", res, open, close + 1);
		}
	}

//	Input: nums = [1,1,1,1,1], target = 3
//	Output: 5
//	Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
//	-1 + 1 + 1 + 1 + 1 = 3
//	+1 - 1 + 1 + 1 + 1 = 3
//	+1 + 1 - 1 + 1 + 1 = 3
//	+1 + 1 + 1 - 1 + 1 = 3
//	+1 + 1 + 1 + 1 - 1 = 3
	static int findTargetSumWays(int[] nums, int target) {
		return findTargetSumWays(nums, target, 0, 0);

	}

	static int findTargetSumWays(int[] nums, int target, int curSum, int idx) {

		if (idx == nums.length) {
			return curSum == target ? 1 : 0;
		}
		int left = findTargetSumWays(nums, target, curSum + nums[idx], idx + 1);
		int right = findTargetSumWays(nums, target, curSum - nums[idx], idx + 1);
		return left + right;
	}

//	This is under Dynamic Programming
	public int findTargetSumWaysDP(int[] nums, int target) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		if (sum < target || (sum + target) % 2 == 1) {
			return 0;
		}
		int s = (sum + Math.abs(target)) / 2;
		int[] dp = new int[s + 1];
		dp[0] = 1;
		for (int num : nums) {
			for (int i = s; i >= num; i--) {
				dp[i] += dp[i - num];
			}
		}
		return dp[s];
	}

//	END OF MEDIUM P

//	HARD P

//	Input: board = [
//	["5","3",".",".","7",".",".",".","."],
//	["6",".",".","1","9","5",".",".","."],
//	[".","9","8",".",".",".",".","6","."],
//	["8",".",".",".","6",".",".",".","3"],
//	["4",".",".","8",".","3",".",".","1"],
//	["7",".",".",".","2",".",".",".","6"],
//	[".","6",".",".",".",".","2","8","."],
//	[".",".",".","4","1","9",".",".","5"],
//	[".",".",".",".","8",".",".","7","9"]]
//	Output: [
//	["5","3","4","6","7","8","9","1","2"],
//	["6","7","2","1","9","5","3","4","8"],
//	["1","9","8","3","4","2","5","6","7"],
//	["8","5","9","7","6","1","4","2","3"],
//	["4","2","6","8","5","3","7","9","1"],
//	["7","1","3","9","2","4","8","5","6"],
//	["9","6","1","5","3","7","2","8","4"],
//	["2","8","7","4","1","9","6","3","5"],
//	["3","4","5","2","8","6","1","7","9"]]

	static boolean solve(char[][] board, int row, int col) {
		if (row == board.length) {
			return true;
		}

		// if the row ends then we will move to next row and colunm will be started
		// again from 0
		if (col == board[0].length) {
			return solve(board, row + 1, 0);
		}

		// if there is a number already filled then we will skip it
		if (board[row][col] != '.') {
			return solve(board, row, col + 1);
		}

		// trying different numbers for the cell
		for (char i = '1'; i <= '9'; i++) {
			if (isSafe(board, row, col, i)) { // checking if a particular number is valid or not at that place
				board[row][col] = i; // writing number at the current cell
				// checking that next part of the sudoku is solved or not
				if (solve(board, row, col + 1)) {
					return true;
				} else {
					// backtracking by removing the numbers which are wrong
					board[row][col] = '.';
				}
			}
		}

		return false;
	}

	static boolean isSafe(char[][] board, int row, int col, int num) {
		// checking row wise
		for (int i = 0; i < board.length; i++) {
			if (board[row][i] == num) {
				return false;
			}
		}

		// checking column wise
		for (int i = 0; i < board[0].length; i++) {
			if (board[i][col] == num) {
				return false;
			}
		}

		// checking the 3x3 outer box
		int sqrt = (int) (Math.sqrt(board.length)); // it will find the length of the boxes of the sudoku i.e. 3 for
													// this question
		int rowStart = row - row % sqrt; // to find the starting position of the current box
		int colStart = col - col % sqrt;
		for (int i = rowStart; i < rowStart + sqrt; i++) { // it will go till the end of the box (start index + length
															// of the box)
			for (int j = colStart; j < colStart + sqrt; j++) {
				if (board[i][j] == num) {
					return false;
				}
			}
		}

		// if the number is not present at any of the cases then return true that yes it
		// is the right place
		return true;
	}

	static void solveSudoku(char[][] board) {
		solve(board, 0, 0);
	}

//	END OF HARD P

//	rat in a maze
	static boolean maze(int[][] arr, int[][] sol, int x, int y) {
		if (x == arr.length - 1 && y == arr.length - 1) {
			return true;
		}

		if (x >= 0 && y >= 0 && x < arr.length && y < arr.length && arr[x][y] == 1) {
			sol[x][y] = 1;
			if (maze(arr, sol, x + 1, y) || maze(arr, sol, x, y + 1)) {
				return true;
			}
			sol[x][y] = 0;
			return false;
		}

		return false;

	}

}
