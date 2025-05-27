package main;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

//		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.err.println(shiftGrid(grid, 1));
//		System.err.println(spiral(grid));

//		int[][] grid = { { 11, 1 }, { 1, 11 } };
//		System.err.println(equalPairs(grid));

//		int dimension = grid.length * grid.length;
//		
//		int[][] copy = new int[grid.length][grid[0].length];
//		int cols = grid.length; 
//		int rows = grid.length;
//		
//		int idx = 0;
//		for(int i = 0; i < dimension; i++) {
//			int r = (i / cols) % rows;
//			int c = i % rows;
//			copy[idx / cols][idx % cols] = grid[r][c]; 
//			idx++;
//		}
//		System.err.println(Arrays.deepToString(copy));

//		int[][] grid = {{1,2,4},{3,3,1}};
//		deleteGreatestValue(grid);
//		System.err.println(totalMoney(20));

//		int[] g = {3,9,1,4,5,2,6,8};

//		int[] g = new int[100_000];
//		
//		for(int i = 0; i < g.length; i++) {
//			g[i] = new Random().nextInt(1000);
//		}
//		
//		insertion(g);
//		
////		qs(g, 0, g.length - 1);
//		
////		selectionSort(g);
////		
//////		for(int i = 0; i < g.length; i++) {
//////			g[i] = new Random().nextInt(20);
//////		}
////		
////		insertion(g);
//		for(int i = 0; i < g.length; i++) {
//			System.err.print(g[i] + " ");
//			if(i % 30 == 0) {
//				System.err.println();
//			}
//		}
//		List<SH> l = new ArrayList<>();
//		for(int i = 0; i < 2; i++) {
//			SH s= new SH();
//			s.name = "name" + i;
//			s.setMap("name" + i, i + 5);
//			s.setMap("name2" + i, i + 10);
//			l.add(s);
//			
//		} 
//		
//		int grandToal = 0;
//		for(SH sh : l) {
//			grandToal += sh.getTotal();
//			System.err.println(sh + ":" + sh.getTotal());
//		}
//		System.err.println(grandToal);
//		

//		
//		int[][] arr = {{1,2}, {3, 5}, {2, 9}};
//		mst(arr);
//		

//		Node n = new Node(1);
//		n.l = new Node(2);
//		n.r = new Node(3);
//		n.l.l = new Node(4);
//		n.l.r = new Node(5);

//				1
//			2		3
//		4		5

		Node n = new Node(10);
		Node n7 = new Node(7);
		Node n6 = new Node(6);
		Node n1 = new Node(1);
		Node n8 = new Node(8);
		Node n9 = new Node(9);

		Node n11 = new Node(11);
		Node n20 = new Node(20);
		Node n14 = new Node(14);
		Node n22 = new Node(22);

		n.l = n7;
		n.r = n6;
		n.l.l = n6;
		n.l.r = n8;
		n.l.l.l = n1;
		n.l.r.r = n9;

//		
//		n.r = n11;
//		n.r.r = n20;
//		n.r.r.l = n14;
//		n.r.r.r = n22;

//		preOrder(n);
//		System.err.println(fac(5));
//		inOrder(n);
//		while(r != null) {
//			System.err.println(r);
//			r = r.l;
//		}
//		System.err.println(r);

//		for(int i = 0; i < 5; i++) {
//			n.l = new Node(i);
//		}
//		
//		
//	
//		System.err.println(n);

//		ln(n);

//		Consumer<Integer> c = e -> {
//			System.err.println(e);
//		};
//		
//		c.accept(30);
//		
//		Supplier<Integer> s = () -> {
//			return 3;
//		};

//		System.err.println(s.get());
//		
//		
//		Function<Integer, String> f = a -> {
//			return a + "kdkdkdkd";
//		};
//		
//		System.err.println(f.apply(30));
//		
//		Predicate<Node> p = t -> {
//			return t.val == 3;
//		};
//		System.err.println(p.test(n));
//		
//		System.err.println(preOrderSum(n));
//		System.err.println(fib(7));

//		System.err.println(cpath(5, 5));
//		int[] arr = {3,1,5,4,2,1};
//		qsort(arr, 0, arr.length - 1);
//		System.err.println(Arrays.toString(arr));

//		int[] arr = {5,3,4};
//		System.err.println(Arrays.toString(cs(7, arr)));
//		
//		String str = "h";
//		String s = "h";
//		

//		System.err.println(canConstruct(str, new String[] {s, "e", "l", "l", "o"}));

//		List<Integer> nums = new ArrayList<>(Arrays.asList(4,3,5));

//		List<Integer>[] tt = new List[3];
//		tt[0] = null;
////		
//		System.err.println();
////	

//		System.err.println(howSum(7, new int[] {3,4,5}));

//		System.err.println(prime(15));

//		List<List<Integer>> res = new ArrayList<>();
//		bMulti(new int[] { 2, 3, 4 }, 8, res, new ArrayList<>(), 0);
//		System.err.println(res);

//		String sql = "SELECT * FROM SCHEMA_NAME.TABLE_NAME LEFT JOIN TABLE_NAME2 ON TABLE_NAME.COLUMN_NAME = TABLE_NAME2.COLUMN_NAME WHERE TABLE_NAME.COLUMN_NAME = 'SFDSDFSFDSF' ";
//		StringBuilder sb = new StringBuilder();
//		constructsql(sql, sb, "");
//		System.err.println(sb.toString());

//		int[][] grid = { 
//				{ 0, 6, 0 }, 
//				{ 5, 8, 7 }, 
//				{ 0, 9, 0 } };
//		System.err.println(getMaximumGold(grid));

//		System.err.println(longestPalindrome("bbb"));

//		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
//		System.err.println(exist(board, "ABCCE"));
//
//		System.err.println(treeSum(new int[] { 1, 1, 2, 3, 5 }, 6));

//		System.err.println(csum(0, new int[] { 2, 4, 8 }, 10));

//		System.err.println(canContruct("zz", new String[] {"ab", "abc", "cd", "def", "abcd"}));

//		System.err.println(howConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
//		System.out.println(fibb(7));

	}

	public int countCharacters(String[] words, String chars) {
		int res = 0;

		int[] count = new int[26];

		for (char c : chars.toCharArray()) {
			count[c - 'a']++;
		}

		for (String w : words) {
			if (canForm(w, count)) {
				res += w.length();
			}
		}

		return res;

	}

	static boolean canForm(String w, int[] counts) {
		int[] c = new int[26];

		for (char ch : w.toCharArray()) {
			int x = ch - 'a';
			c[x]++;

			if (c[x] > counts[x]) {
				return false;
			}
		}

		return true;

	}

	// 100% work
	static String minRemoveToMakeValid(String s) {
		int open = 0;
		int close = 0;
		int flag = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				open++;
				flag++;
			} else if (s.charAt(i) == ')' && flag > 0) {
				close++;
				flag--;
			}

		}

		int k = Math.min(open, close);
		open = k;
		close = k;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				if (open > 0) {
					open--;
					sb.append(s.charAt(i));
				}
				continue;
			}
			if (s.charAt(i) == ')') {
				if (close > 0 && close > open) {
					close--;
					sb.append(s.charAt(i));
				}
				continue;
			}

			sb.append(s.charAt(i));
		}

		return sb.toString();

	}

	static int longest(String s) {
		char[] arr = s.toCharArray();

		int l = 0;
		int c = 0;
		for (int r = 0; r < s.length(); r++) {
			if (arr[r] == 0) {

			}
		}

		return c;
	}

	static void fuel(int[] gas, int[] fuel) {

	}

	static boolean canSum(int[] arr, int t) {

		if (t == 0) {
			return true;
		}
		if (t < 0) {
			return false;
		}

		for (int a : arr) {
			int r = t - a;
			if (canSum(arr, r)) {
				return true;
			}
		}

		return false;

	}

	static int fibb(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibb(n - 1) + fibb(n - 2);
		}
	}

	static class T {
		String p;

		List<String> c;

		public int countchild() {
			return c.size();
		}
	}

	static int maxw(T t) {
		int res = 0;

		res = Math.max(res, t(t.c, t).countchild());

		return res;
	}

	static T t(List<String> c, T t) {
		if (t == null) {
			return null;
		}
		System.err.println(t.p);
		return t(t.c, t);
	}

	public int widthOfBinaryTree(Node root) {

		if (root == null) {
			return 0;
		}

		int r = 1;

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {

			Node e = q.remove();

			if (e.l != null) {
				q.add(e.l);
			}

			if (e.r != null) {
				q.add(e.r);
			}
			r = Math.max(r, q.size());
		}

		return r;

	}

	static int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		int l = maxDepth(root.l) + 1;
		int r = maxDepth(root.r) + 1;
		return Math.max(l, r);

	}

//
//	static int maxDepth(Node root) {
//		if (root == null) {
//			return 0;
//		}
//
//		int r = 1;
//
//		Queue<Node> q = new LinkedList<>();
//		q.add(root);
//
//		
//		while (!q.isEmpty()) {
//
//			Node e = q.remove();
//
//			if (e.l != null) {
//				q.add(e.l);
//			}
//
//			if (e.r != null) {
//				q.add(e.r);
//			}
//			
//		}
//
//		return r;
//		
//		
//	}

	static List<List<Integer>> treeSum(int[] arr, int t) {
		Arrays.sort(arr);

		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			int l = i + 1;
			int r = arr.length - 1;

			while (l < r) {
				int sum = arr[i] + arr[l] + arr[r];

				if (sum == t) {
					res.add(new ArrayList<>(Arrays.asList(arr[i], arr[l], arr[r])));
					l++;
					r--;

					while (arr[l] == arr[l - 1] && l < r) {
						l++;
					}

					while (arr[r + 1] == arr[r] && l < r) {
						r--;
					}

				} else if (sum < t) {
					l++;
				} else {
					r--;
				}
			}

		}

		return res;
	}

	static boolean exist(char[][] board, String word) {

		boolean[][] v = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (word.charAt(0) == board[i][j] && found(board, word, i, j, 0, v)) {
					return true;
				}
			}
		}

		return false;
	}

	static boolean found(char[][] board, String word, int r, int c, int idx, boolean[][] v) {

		if (idx == word.length()) {
			return true;
		}
		if (r < 0 || r == board.length || c < 0 || c == board[0].length || board[r][c] != word.charAt(idx)
				|| v[r][c] == true) {
			return false;
		}

		v[r][c] = true;
		if (found(board, word, r + 1, c, idx + 1, v) || found(board, word, r - 1, c, idx + 1, v)
				|| found(board, word, r, c + 1, idx + 1, v) || found(board, word, r, c - 1, idx + 1, v)) {
			return true;
		}

		v[r][c] = false;

		return false;

	}

	static int longestPalindrome(String s) {

		char[] dic = new char[85];
		int sum = 0;
		boolean odd = false;

		for (char c : s.toCharArray()) {
			dic[c - 'A']++;
		}
		System.err.println(Arrays.toString(dic));

		for (int i = 0; i < 85; i++) {
			int v = dic[i];

			if (v % 2 == 0) {
				sum += v;
			} else {
				sum += v - 1;
				odd = true;
			}

		}

		return sum + (odd ? 1 : 0);

	}

	static List<List<Integer>> subset(int[] arr) {
		List<List<Integer>> res = new ArrayList<>();
		subset(arr, res, new ArrayList<>(), 0);
		return res;
	}

	static void subset(int[] arr, List<List<Integer>> res, List<Integer> tmp, int idx) {

		res.add(new ArrayList<>(tmp));
		for (int i = idx; i < arr.length; i++) {
			tmp.add(arr[i]);
			subset(arr, res, tmp, i + 1);
			tmp.remove(tmp.size() - 1);
		}

	}

	static int max = 0;

	private static int getMaximumGold(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] != 0) {
//					getm(grid, i, j, 0);
					getMaximumGold(grid, i, j, grid.length, grid.length, 0);
				}
			}
		}

		return max;
	}

	static void getMaximumGold(int[][] grid, int r, int c, int rlen, int clen, int cur) {

		if (r < 0 || r >= rlen || c < 0 || c >= clen || grid[r][c] == 0) {
			max = Math.max(max, cur);
			return;
		}
		int val = grid[r][c];
		grid[r][c] = 0;
		getMaximumGold(grid, r + 1, c, rlen, clen, cur + val);
		getMaximumGold(grid, r - 1, c, rlen, clen, cur + val);
		getMaximumGold(grid, r, c + 1, rlen, clen, cur + val);
		getMaximumGold(grid, r, c - 1, rlen, clen, cur + val);
		grid[r][c] = val;

	}

	static void getm(int[][] grid, int row, int col, int cur) {

		if (row < 0 || row >= grid.length || col < 0 || col >= grid.length) {
			max = Math.max(max, cur);
			return;
		}

		int prev = grid[row][col];
		grid[row][col] = 0;
		getm(grid, row + 1, col + 1, cur + prev);
		grid[row][col] = prev;

	}

	static void constructsql(String sql, StringBuilder res, String r) {

		if (sql.equals("")) {
			res.append(r);
			return;
		}

		if (sql.startsWith("FROM")) {
			String table = sql.substring(sql.indexOf("FROM"), sql.indexOf(".") + 1).replace(".", "_");
			String[] arr = table.split(" ");
			int len = table.length();
			String newTable = arr[0] + " VIEW." + arr[1];
			constructsql(sql.substring(len), res, r + newTable);

		} else {
			constructsql(sql.substring(1), res, r + sql.substring(0, 1));
		}

	}

	static String sq(String sql) {
		if (sql.equals("")) {
			return "";
		}

		if (sql.equals(null)) {
			return null;
		}

		String suf = sql.substring(sql.indexOf("FROM") + 5, sql.length());
		String res = sq(suf);
		if (sq(sql) != null) {
			return res;
		}

		return null;
	}

	static void bMulti(int[] nums, int n, List<List<Integer>> res, List<Integer> tmp, int idx) {

		if (n == 0) {
			res.add(new ArrayList<>(tmp));
			return;
		}

		if (n < 0) {
			return;
		}
		System.err.println(idx);
		for (int i = idx; i < nums.length; i++) {

			tmp.add(nums[i]);
			bMulti(nums, n - nums[i], res, tmp, i);
			tmp.remove(tmp.size() - 1);

		}

	}

	static boolean cans(int[] nums, int n) {
		boolean[][] t = new boolean[nums.length + 1][n + 1];
		for (int i = 0; i < nums.length + 1; i++) {
			t[i][0] = true;
		}

		for (int i = 1; i < nums.length + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (nums[i - 1] <= j && t[i - 1][j - nums[i - 1]]) {
					t[i][j] = true;
				} else if (t[i - 1][j]) {
					t[i][j] = true;
				}
			}
		}

		for (boolean[] b : t) {
			System.err.println(Arrays.toString(b));
		}

		return t[nums.length][n];
	}

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

	static int[] cs(int t, int[] a) {

		if (t == 0) {
			return new int[] {};
		}

		if (t < 0) {
			return null;
		}

		for (int n : a) {
			int rem = t - n;
			int[] remRes = cs(rem, a);
			if (remRes != null) {
				int[] res = new int[remRes.length + 1];
				for (int i = 0; i < remRes.length; i++) {
					res[i] = remRes[i];
				}
				res[remRes.length] = n;
				return res;
			}

		}

		return null;
	}

	static Map<String, Integer> map = new HashMap<>();

	static int cpath(int m, int n) {
		String k = m + "," + n;
		if (map.containsKey(k)) {
			return map.get(k);
		}

		if (m == 1 || n == 1) {
			return 1;
		}
		if (n == 0 || n == 0) {
			return 0;
		}
//		-1961361076
		map.put(k, cpath(m - 1, n) + cpath(m, n - 1));
		return map.get(k);

	}

	static int fib(int n) {
		if (n <= 2) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);
	}

	static int preOrderSum(Node n) {
		if (n == null) {
			return 0;
		}
		return n.val + preOrderSum(n.l) + preOrderSum(n.r);
	}

	static int fac(int n) {
		if (n <= 1) {
			return 0;
		}
		return fac(n - 1) + fac(n - 1);

	}

	static void preOrder(Node n) {
		if (n == null) {
			return;
		}

		System.err.println(n.val);
		preOrder(n.l);
		preOrder(n.r);

	}

	static void inOrder(Node n) {
		if (n == null) {
			return;
		}

		inOrder(n.l);
		System.err.println(n.val);
		inOrder(n.r);

	}

	static void ln(Node n) {
		if (n == null) {
			return;
		}

		System.err.println(n.val);
		n = n.l;

		ln(n);
	}

	static class Node {

		int val;

		Node l;

		Node r;

		Node(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return "Node [val=" + val + ", l=" + l + "]";
		}

	}

	static class SH {
		String name;
		Map<String, Integer> map;

		SH() {
			map = new HashMap<>();
		}

		void setMap(String k, int v) {
			map.put(k, v);
		}

		double getTotal() {
			double d = 0;
			for (String k : map.keySet()) {
				d += map.get(k);
			}
			return d;
		}

		@Override
		public String toString() {
			return "SH [name=" + name + ", map=" + map + "]";
		}
	}

	static int totalMoney(int n) {
		int res = 0;
		int sm = 1;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				res++;
				continue;
			}
			if (i % 7 == 0) {
				++sm;
			}

			res += (sm + (i % 7));
		}
		return res;
	}

	static int deleteGreatestValue(int[][] grid) {
		int res = 0;

		List<List<Integer>> l = new ArrayList<>();
		int rows = grid.length;

		for (int i = 0; i < rows; i++) {
			l.add(new ArrayList<>());
		}

		for (int i = 0; i < rows * rows; i++) {
			int r = (i / rows) % rows;
			int c = i % rows;
			l.get(i / rows).add(grid[r][c]);
		}

		System.err.println(l);

		return res;

	}

	static int equalPairs(int[][] grid) {
		Map<String, Integer> h = new HashMap<>();
		int n = grid.length;
		String x = "";
		for (int i = 0; i < n; i++) {
			x = "";
			for (int j = 0; j < n; j++) {
				x += grid[i][j] + "-";
			}
			h.put(x, h.getOrDefault(x, 0) + 1);
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			x = "";
			for (int j = 0; j < n; j++) {
				x += grid[j][i] + "-";
			}
			if (h.containsKey(x)) {
				count += h.get(x);
			}
		}
		System.err.println(h);
		return count;

	}

	static List<List<Integer>> shiftGrid(int[][] grid, int k) {
		List<List<Integer>> res = new ArrayList<>();

		int rows = grid.length;
		int cols = grid[0].length;
		int dimension = rows * cols;

		for (int i = 0; i < rows; i++) {
			res.add(new ArrayList<>());
		}
		k %= (rows * cols);
		int begin = dimension - k;

		int idx = 0;
		for (int i = begin; i < begin + dimension; i++) {
			int r = (i / cols) % rows;
			int c = i % cols;
			res.get(idx / cols).add(grid[r][c]);
			idx++;
		}

		return res;
	}

	static List<Integer> spiral(int[][] grid) {
		List<Integer> res = new ArrayList<>();

		int rows = grid.length;
		int cols = grid[0].length;

		int left = 0;
		int right = cols - 1;
		int top = 0;
		int bottom = rows - 1;

		while (res.size() < rows * cols) {

			for (int i = left; i <= right; i++) {
				res.add(grid[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				res.add(grid[i][right]);
			}
			right--;

			if (right < left) {
				break;
			}

			for (int i = right; i >= left; i--) {
				res.add(grid[bottom][i]);
			}
			bottom--;

			if (bottom < top) {
				break;
			}

			for (int i = bottom; i >= top; i--) {
				res.add(grid[i][left]);
			}

			left++;

		}

		return res;
	}

	static void mst(int[][] arr) {
//		new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
//		
//		new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		Runnable r = () -> {
			System.err.println("run void");
		};

		r.run();

		Comparator<Integer> cc = (a, b) -> {
			return a.compareTo(b);
		};
		System.err.println(cc.compare(233, 5));
		Arrays.sort(arr, (a, b) -> {
			System.err.println(Arrays.toString(a));
//			System.err.print(a[0]);
//			System.err.print("----");
//			System.err.print(b[0]);
//			System.err.println();
			return a[0] - b[0];
		});

		List<AA> l = new ArrayList<>();

		AA a = new AA("aa", 1);
		AA b = new AA("bb", 2);
		AA c = new AA("cc", 3);
		l.add(a);
		l.add(c);
		l.add(b);

		Comparator<AA> ac = (aa, bb) -> {
			return aa.name.compareTo(bb.name);
		};
		Collections.sort(l, ac);
		System.err.println(l);

		System.err.println(Arrays.deepToString((arr)));

	}

	static class AA {
		String name;
		int id;

		AA(String name, int id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "AA [name=" + name + ", id=" + id + "]";
		}

	}

	static long maximumSubarraySum(int[] nums, int k) {

		int l = 0;
		int r = nums.length;
		long max = Long.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			Map<Integer, Integer> map = new HashMap<>();
			int w = i + k - 1;

			if (w < nums.length) {
				int j = i;
				while (j <= w) {
					map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
					j++;
				}
			}

			long sum = 0;
			for (int key : map.keySet()) {
				if (map.get(key) == 1) {
					sum += key;
				}
			}

			max = Math.max(max, sum);

		}

		return max;
	}

	static long timelapse(String f, String s) {

		System.err.println(f.substring(0, f.indexOf((":"))));
		System.err.println(f.substring(f.indexOf(":") + 1, f.lastIndexOf(":")));
		LocalTime lt = LocalTime.parse(f);
		;

		return 0;
	}

	static int divisorSubstrings(int num, int k) {

		int c = 0;
		String s = String.valueOf(num);

		for (int i = 0; i < s.length(); i++) {

			int w = i + k - 1;
			if (w < s.length()) {
				int j = i;
				String sa = "";
				while (j <= w) {
					sa += s.charAt(j) + "";
					j++;
				}
				Integer v = Integer.valueOf(sa);

				int pv = v.intValue();
				System.err.println(pv);
				boolean r = num % pv == 0;
				if (r) {
					c++;
				}

			}
		}
		return c;

	}

}
