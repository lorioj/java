package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringTopic {

	public static void main(String[] args) {
		System.err.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }, 0)); // output: [[-1, -1, 2], [-1, 0, 1]]
	}

	private static List<List<Integer>> threeSum(int[] arr, int targer) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i - 1] == arr[i]) {
				continue;
			}

			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {
				int total = arr[i] + arr[j] + arr[k];

				if (total == targer) {
					res.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
					j++;
					k--;

					while (j < k && arr[j - 1] == arr[j]) {
						j++;
					}
					while (j < k && arr[k] == arr[k + 1]) {
						k--;
					}

				} else if (total < targer) {
					j++;
				} else {
					k--;
				}

			}

		}

		return res;
	}

}
