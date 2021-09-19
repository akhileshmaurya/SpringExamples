package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManasaAndStone {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    int n, a, b, min, max;
    for (int i = 0; i < t; i++) {
      n = Integer.parseInt(br.readLine());
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      if (a <= b) {
        min = a;
        max = b;
      } else {
        min = b;
        max = a;
      }
      for (int j = 0; j < n; j++) {
        System.out.print((max * j + min * (n - j - 1)) + " ");
      }
    }
  }
}
