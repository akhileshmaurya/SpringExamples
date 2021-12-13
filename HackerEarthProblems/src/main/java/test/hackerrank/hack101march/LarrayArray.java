package test.hackerrank.hack101march;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LarrayArray {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    while (t > 0) {
      int size = Integer.parseInt(br.readLine().trim());
      String[] input = br.readLine().trim().split(" ");
      int[] intArray = new int[size];
      for (int i = 0; i < input.length; i++) {
        intArray[i] = Integer.parseInt(input[i]);
      }

      --t;
    }
  }
}
