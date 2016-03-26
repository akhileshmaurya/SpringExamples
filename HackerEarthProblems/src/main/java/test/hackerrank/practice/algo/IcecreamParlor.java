package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IcecreamParlor {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n, m;
		String[] input;
		int[] inputInt = new int[10001];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < 10001; j++) {
				inputInt[j] = -1;
			}
			m = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			input = br.readLine().split(" ");
			for (int j = 0; j < input.length; j++) {
				inputInt[Integer.parseInt(input[j])] = j;
			}
			for (int j = 0; j < input.length; j++) {
				int value = Integer.parseInt(input[j]);
				if ((m - value) > 0 && inputInt[m - value] > 0 && j!=inputInt[m - value]) {
					System.out.println((j+1) + " " + (inputInt[m - value] +1)+ " ");
					break;
				}
			}
		}

	}
}
