package test.hackerrank.practice.algo;

import java.util.Arrays;
import java.util.Scanner;

public class MarksAndToys {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt(), k = stdin.nextInt();
		int prices[] = new int[n];
		for (int i = 0; i < n; i++)
			prices[i] = stdin.nextInt();

		int answer = 0;
		long sum = 0;
		Arrays.sort(prices);
		for (int i = 0; i < prices.length; i++) {
			sum = sum + prices[i];
			if (k < sum) {
				break;
			}
			answer++;
		}
		System.out.println(answer);
	}
}
