package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SherlockAndArray {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long n;
		String[] input;
		long[] inputInt;
		for(int i = 0; i < t; i++) {
			n = Long.parseLong(br.readLine());
			inputInt = new long[(int) n];
			long totalSum = 0;
			boolean isValid = false;
			input = br.readLine().split(" ");
			for (int j = 0; j < input.length; j++) {
				inputInt[j] = Long.parseLong(input[j]);
				totalSum = totalSum + inputInt[j];
			}
			long partialSum = 0;
			for (int j = 0; j < n - 1; j++) {
				partialSum = partialSum + inputInt[j];
				if ((totalSum - inputInt[j + 1]) % 2 == 0 && (totalSum - inputInt[j + 1]) / 2 == partialSum && j!=n-1) {
					isValid = true;
					break;
				}
			}
			if (isValid) {
				System.out.println("YES");

			} else
				System.out.println("NO");
		}

	}
}
