package main;

import java.util.ArrayList;
import java.util.List;

public class BfsDfs {

	public static void main(String[] args) {

		Node n = new Node(0);
		Node n1 = new Node(1);

		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);

		List<Node> nchild = new ArrayList<>();
		nchild.add(n1);
		nchild.add(n2);
		n.setChildren(nchild);

		List<Node> n1child = new ArrayList<>();
		n1child.add(n3);
		n1child.add(n4);
		n1.setChildren(n1child);

		dfs(n);

	}

	static void dfs(Node n) {
		if (n == null) {
			return;
		}

		System.out.println(n.val);

		for (Node node : n.getChildren()) {
			dfs(node);
		}

	}

	static class Node {
		int val;
		boolean visited;

		List<Node> children;

		Node(int val) {
			this.val = val;
			this.children = new ArrayList<>();
		}

		void setChildren(List<Node> children) {
			this.children = children;
		}

		void setVisited(boolean visited) {
			this.visited = visited;
		}

		public List<Node> getChildren() {
			return this.children;
		}

	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

	}

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
	}

}
