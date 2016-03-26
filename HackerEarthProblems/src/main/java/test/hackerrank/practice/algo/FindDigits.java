package test.hackerrank.practice.algo;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long n, temp, a, count;
		for (int i = 0; i < t; i++) {
			n = in.nextInt();
			temp = n;
			count = 0;
			while (temp > 0) {
				a = temp % 10;
				if (a > 0 && n % a == 0) {
					count++;
				}
				temp = temp / 10;
			}
			System.out.println(count);
		}
		in.close();
	}
}
