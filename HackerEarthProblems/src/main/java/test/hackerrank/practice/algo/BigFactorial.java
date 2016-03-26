package test.hackerrank.practice.algo;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigFactorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigDecimal fact = BigDecimal.ONE;
		if (n == 0 || n == 1) {
			fact = BigDecimal.ONE;
		} else {
			for (int i = n; i > 1; i--) {
				fact = fact.multiply(new BigDecimal(String.valueOf(i)));
			}
		}
		System.out.println(fact);
		in.close();
	}
}
