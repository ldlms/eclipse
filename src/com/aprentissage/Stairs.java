package com.aprentissage;

public class Stairs {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(climStairs(n));

	}

	public static int climStairs(int n) {
		int soluce = 0;

		// if ((n - 2) >= 2) {
		// soluce += (n - 2) * 2;
		// soluce += (n - 2) - 1;
		// } else {
		// soluce = n;
		// }

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				soluce++;
			}
			if (i > 1) {
				soluce += 2;
			}
		}

		return soluce;
	}

}
