package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountSort3 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] count = new int[100];
    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      count[Integer.parseInt(input[0])]++;
    }
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum = sum + count[i];
      System.out.print(sum + " ");
    }
  }
}
