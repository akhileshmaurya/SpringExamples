package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountSort2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] count = new int[100];
		for (int i = 0; i < input.length; i++) {
			count[Integer.parseInt(input[i])]++;
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < count[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
}
