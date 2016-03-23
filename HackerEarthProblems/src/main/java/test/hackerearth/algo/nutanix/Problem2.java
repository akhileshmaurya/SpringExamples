package test.hackerearth.algo.nutanix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2 {

	public static void main(String[] args) throws Exception {
		long charString[] = new long[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().trim().toCharArray();
		long initialNumber = 1;
		int initialChar = input[0];
		long frequency = 0;
		int initial=0;
		for (char ch : input) {
			if (ch >= 'a' && ch <= 'z') {
				if (initial != 0)
					charString[initialChar - 'a'] = charString[initialChar - 'a'] + frequency;
				initialChar = ch;
				initialNumber = 1;
				frequency=0;
			} else if (ch >= '0' && ch <= '9') {
				frequency = frequency * initialNumber + (ch - '0');
				initialNumber = initialNumber * 10;
			}
			initial++;
		
		}
		charString[initialChar - 'a'] = charString[initialChar - 'a'] + frequency;
		for (int i = 0; i < charString.length; i++) {
			System.out.print((char)(i+'a'));
			System.out.println(" : "+charString[i]);
		}
		long q = Long.parseLong(br.readLine().trim());
		for (long i = 0; i < q; i++) {
			long k = Long.parseLong(br.readLine().trim());
			long temp = 0;
			boolean found = false;
			for (int j = 0; j < charString.length; j++) {
				temp = temp + charString[j];
				if (k <= temp) {
					System.out.println((char) (j + 'a'));
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println("-1");
		}

	}

}
