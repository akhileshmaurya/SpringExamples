package test.hackerrank.practice.algo;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int pCount = 0, zcount = 0, ncount = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] < 0)
				ncount++;
			else if (arr[arr_i] == 0)
				zcount++;
			else
				pCount++;
		}
		int size=arr.length;
		
		System.out.println(String.format("%.6f",(double)pCount/size ));
		System.out.println(String.format("%.6f",(double)ncount/size ));
		System.out.println(String.format("%.6f",(double)zcount/size ));
		in.close();
	}
}
