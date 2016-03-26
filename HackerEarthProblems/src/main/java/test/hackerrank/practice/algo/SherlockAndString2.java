package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SherlockAndString2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String in = reader.readLine();
		isValidString(1, in);
	}

	private static void isValidString(int testNumber, String in) {
		int[] count = new int[26];
		int mRepetition = 0;
		int maximumKey = 0;

		char[] stringIncharArray = in.toCharArray();

		for (int i = 0; i < stringIncharArray.length; ++i) {
			count[stringIncharArray[i] - 'a']++;
			if (mRepetition < count[stringIncharArray[i] - 'a']) {
				mRepetition = count[stringIncharArray[i] - 'a'];
			}
		}

		int[] m = new int[mRepetition + 1];
		mRepetition = 0;

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				m[count[i]]++;
				if (mRepetition < m[count[i]]) {
					mRepetition = m[count[i]];
					maximumKey = count[i];
				}
			}
		}

		int result = 1;
		for (int i = 0; i < 26; ++i) {
			if (count[i] != 0 && count[i] != maximumKey) {
				if (count[i] < maximumKey) {
					System.out.println("NO");
					return;
				}
				result -= (count[i] - maximumKey);
			}
		}

		if (result < 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
