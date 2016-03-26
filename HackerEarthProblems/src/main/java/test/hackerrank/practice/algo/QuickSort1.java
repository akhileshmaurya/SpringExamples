package test.hackerrank.practice.algo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort1 {
	static void partition(Integer[] ar) {
		int piote = ar[0];
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < piote)
				list1.add(ar[i]);
			else
				list.add(ar[i]);
		}
		list1.add(piote);
		list1.addAll(list);
		ar=list1.toArray(ar);
	}

	static void printArray(Integer[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] ar = new Integer[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		printArray(ar);
	}
}
