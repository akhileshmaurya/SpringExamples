package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MissingNumber {

  @SuppressWarnings("unused")
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] inputA = br.readLine().split(" ");
    int m = Integer.parseInt(br.readLine());
    String[] inputB = br.readLine().split(" ");
    int[] counterA = new int[10001];
    int[] counterB = new int[10001];
    for (int i = 0; i < inputA.length; i++) {
      counterA[Integer.parseInt(inputA[i])]++;
    }
    for (int i = 0; i < inputB.length; i++) {
      counterB[Integer.parseInt(inputB[i])]++;
    }
    for (int i = 0; i < 10001; i++) {
      if ((counterA[i] > 0 || counterB[i] > 0) && counterA[i] != counterB[i]) {
        System.out.print(i + " ");
      }
    }
  }
}
