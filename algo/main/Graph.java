package main;

import java.util.Arrays;

public class Graph {

	public static void main(String[] args) {

//		int[][] arr = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int[][] arr = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		System.err.println(Arrays.deepToString(floodFill(arr, 0, 0, 0)));

	}

	static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int ocolor = image[sr][sc];

		if (color == ocolor) {
			return image;
		}

		floodFil(image, sr, sc, color, ocolor);

		return image;
	}

	static void floodFil(int[][] images, int col, int row, int color, int ocolor) {
		if (col < 0 || row < 0 || col >= images.length || row >= images.length || images[row][col] != ocolor) {
			return;
		}

		images[row][col] = color;
		floodFil(images, col + 1, row, color, ocolor);
		floodFil(images, col - 1, row, color, ocolor);
		floodFil(images, col, row + 1, color, ocolor);
		floodFil(images, col, row - 1, color, ocolor);

	}

	// under construction
	static int numIslands(char[][] grid) {

		return 0;
	}

	static int numIslnads(char[][] grid, int row, int col, int count) {

		if (row < 0 || row >= grid.length || col < 0 || col >= grid.length || grid[row][col] == 0) {

		}

		return 0;

	}

}
