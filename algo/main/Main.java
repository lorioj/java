package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//		n.r = n6;
//		n.l.l = n6;
//		n.l.r = n8;
//		n.l.l.l = n1;
//		n.l.r.r = n9;
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

}
