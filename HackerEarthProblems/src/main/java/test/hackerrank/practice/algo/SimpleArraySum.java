package test.hackerrank.practice.algo;

import java.util.Scanner;

public class SimpleArraySum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int sum = 0;
    for (int arr_i = 0; arr_i < n; arr_i++) {
      arr[arr_i] = in.nextInt();
      sum = sum + arr[arr_i];
    }
    System.out.println(sum);
    in.close();
  }
}
