package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SherlockAndString {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		int[] count = new int[26];
		for (int i = 0; i < input.length; i++) {
			count[input[i] - 'a']++;
		}
		Arrays.sort(count);
		Map<Integer, Integer> indiviadualCount = new HashMap<Integer, Integer>();

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				if (indiviadualCount.containsKey(count[i])) {
					indiviadualCount.put(count[i], indiviadualCount.get(count[i]) + 1);
				} else {
					indiviadualCount.put(count[i], 1);
				}
			}

		}

		if (indiviadualCount.size() > 2) {
			System.out.println("NO");
		} else {
			if (indiviadualCount.size() == 2) {
				ArrayList<Integer> disinctValus = new ArrayList<Integer>();
				ArrayList<Integer> disinctkeys = new ArrayList<Integer>();
				for (Entry<Integer, Integer> pair : indiviadualCount.entrySet()) {
					disinctkeys.add(pair.getKey());
					disinctValus.add(pair.getValue());
				}
				int diffkey = disinctkeys.get(0) - disinctkeys.get(1);
				int diffval = disinctValus.get(0);
				if (diffval > disinctValus.get(1))
					diffval = disinctValus.get(1);
				if (diffkey < -1 || diffkey > 1 || diffval > 1) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			} else {
				System.out.println("YES");
			}
		}
	}
}
