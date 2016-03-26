package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AngryProfessor {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k, reachedOnTime;
		String input[];
		int t = Integer.parseInt(br.readLine());
		for (int a0 = 0; a0 < t; a0++) {
			String[] in = br.readLine().split(" ");
			n = Integer.parseInt(in[0]);
			k = Integer.parseInt(in[1]);
			input = br.readLine().split(" ");
			reachedOnTime = 0;
			for (String string : input) {
				if (Integer.parseInt(string) <= 0)
					reachedOnTime++;
			}
			if (k <= reachedOnTime)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
