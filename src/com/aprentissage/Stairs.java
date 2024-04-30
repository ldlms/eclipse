package com.aprentissage;

public class Stairs {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(climStairs(n));

	}

	public static int climStairs(int n) {
		// int soluce;
		// if (n == 1) {
		// return soluce = 1;
		// } else if (n == 2) {
		// return soluce = 2;
		// } else {
		// return climStairs(n - 1) + climStairs(n - 2);
		// }

		// en fait c'est une suite de fibonacci

		if (n == 1)
			return 1;
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];

	}

}
