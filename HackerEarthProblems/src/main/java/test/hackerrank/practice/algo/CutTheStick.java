package test.hackerrank.practice.algo;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheStick {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		Arrays.sort(arr);
		int totalCut=arr.length;
		System.out.println(totalCut);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[i-1]){
				System.out.println(arr.length-i);
			}
		}
		in.close();
	}
}
