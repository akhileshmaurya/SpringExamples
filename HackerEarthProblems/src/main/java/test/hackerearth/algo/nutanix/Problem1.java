package test.hackerearth.algo.nutanix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Problem1 {

	public static void main(String[] args) throws Exception {
		Map<Character, Long> map = new TreeMap<Character, Long>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().trim().toCharArray();
		char initialChar = input[0];
		long frequency = 0;
		int initial = 0;
		for (char ch : input) {
			if (ch >= 'a' && ch <= 'z') {
				if (!map.containsKey(ch))
					map.put(ch, 0l);
				if (initial != 0) {
					map.put(initialChar, map.get(initialChar) + frequency);
				}
				initialChar = ch;
				frequency = 0;
			} else if (ch >= '0' && ch <= '9') {
				frequency = frequency * 10 + (ch - '0');
			}
			initial++;

		}
		map.put(initialChar, map.get(initialChar) + frequency);
		/*for (char c : map.keySet()) {
			
			System.out.println(c+" : "+map.get(c));
				
		}*/
		long q = Long.parseLong(br.readLine().trim());
		for (long i = 0; i < q; i++) {
			long k = Long.parseLong(br.readLine().trim());
			long temp = 0;
			boolean found = false;
			for (char c : map.keySet()) {
				temp = temp + map.get(c);
				if (k <= temp) {
					System.out.println(c);
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println("-1");
		}

	}

}
