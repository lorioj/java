package main;
public class Sorting {
//	bubblesort
//	insertion
//	selection
//	quicksort
//	mergesort
//	sort Node
	public static void main(String[] args) {

	}

	static void bubbleSort(int[] arr) {

		boolean s = true;

		while (s) {
			s = false;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					int tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
					s = true;
				}
			}
		}

	}

	static void insertion(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int c = arr[i];
			int j = i - 1;

			while (j >= 0 && c < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = c;

		}

	}

	static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}

	}

	static void quickSort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}

		int p = arr[high];
		int l = low;
		int r = high;

		while (l < r) {
			while (arr[l] <= p && l < r) {
				l++;
			}
			while (arr[r] >= p && l < r) {
				r--;
			}
			swap(arr, l, r);
		}

		swap(arr, l, high);

		quickSort(arr, low, l - 1);
		quickSort(arr, l + 1, high);

	}

	static void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}

		int h = arr.length / 2;
		int[] lA = new int[h];
		int[] rA = new int[arr.length - h];

		for (int i = 0; i < h; i++) {
			lA[i] = arr[i];
		}

		for (int i = h; i < arr.length; i++) {
			rA[i - h] = arr[i];
		}

		mergeSort(lA);
		mergeSort(rA);

		merge(arr, lA, rA);

	}

	static void merge(int[] arr, int[] lA, int[] ra) {

		int i = 0;
		int j = 0;
		int k = 0;

		int lAs = lA.length;
		int rAs = ra.length;

		while (i < lAs && j < rAs) {
			if (lA[i] < ra[j]) {
				arr[k] = lA[i];
				i++;
			} else {
				arr[k] = ra[j];
				j++;
			}
			k++;
		}

		while (i < lAs) {
			arr[k] = lA[i];
			i++;
			k++;
		}

		while (j < rAs) {
			arr[k] = ra[j];
			j++;
			k++;
		}

	}

	static void swap(int[] arr, int idx1, int idx2) {

		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;

	}
	
	
	static Node sortNode(Node n1, Node n2) {
		Node tmp = new Node(0);
		Node r = tmp;
		System.err.println(r);
		Node p = n1;
		Node p2 = n2;

		while (p != null && p2 != null) {
			if (p.val < p2.val) {
				r.l = p;
				p = p.l;
			} else {
				r.l = p2;
				p2 = p2.l;
			}
			System.err.println(r);
			r = r.l;
		}

		if (p != null) {
			r.l = p;
		}

		if (p2 != null) {
			r.l = p2;
		}

		return tmp.l;

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

}
