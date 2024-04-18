package com.aprentissage;

public class Island {
	public static void main(String[] args) {

		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(islandPerimeter(grid));

	}

	private static int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					perimeter = perimeter + 4;
					if (i > 0) {
						if (grid[i - 1][j] == 1) {
							perimeter--;
						}
					}
					if (i < grid.length - 1) {
						if (grid[i + 1][j] == 1) {
							perimeter--;
						}
					}
					if (j > 0) {
						if (grid[i][j - 1] == 1) {
							perimeter--;
						}
					}
					if (j < grid[i].length - 1) {
						if (grid[i][j + 1] == 1) {
							perimeter--;
						}
					}
				}
			}
		}
		return perimeter;
	}

	public int isGoodlandPerimeter(int[][] grid) {
		int height = grid.length;
		int width = grid[0].length;

		int result = 0;

		for (int y = 0; y < height; y++) {
			int prev = 0;
			for (int x = 0; x < width; x++) {
				int keep = grid[y][x];
				result += prev ^ keep;
				prev = keep;
			}
			result += prev;
		}

		for (int x = 0; x < width; x++) {
			int prev = 0;
			for (int y = 0; y < height; y++) {
				int keep = grid[y][x];
				result += prev ^ keep;
				prev = keep;
			}
			result += prev;
		}
		return result;
	}
}
