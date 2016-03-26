package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxSubArraySum {


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] inputA = br.readLine().split(" ");
		int[] inputint = new int[n];
		for (int i = 0; i < inputA.length; i++) {
			inputint[i] = Integer.parseInt(inputA[i].trim());
		}
		System.out.println(maxSubArraySum(inputint));
	}

	static int maxSubArraySum(int a[]) {
		int maxSoFar = a[0];
		int currMax = a[0];

		for (int i = 1; i < a.length; i++) {
			currMax = max(a[i], currMax + a[i]);
			if (a[i] == 0)
				currMax = 0;
			maxSoFar = max(maxSoFar, currMax);

		}
		return maxSoFar;
	}

	private static int max(int i, int j) {
		if (i >= j)
			return i;
		return j;
	}
}

