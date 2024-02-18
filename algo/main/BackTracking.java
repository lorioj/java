package main;
import java.util.ArrayList;
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
		System.err.println(permute(new int[] {1,2,3}));

	}

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
		
		if(tmp.size() == nums.length) {
			res.add(new ArrayList<>(tmp));
			return;
		}
		
		for(int n : nums) {
			if (tmp.contains(n)) {
				continue;
			}
			tmp.add(n);
			permute(nums, res, tmp);
			tmp.remove(tmp.size() - 1);
		}
		
		
	
	}

}
