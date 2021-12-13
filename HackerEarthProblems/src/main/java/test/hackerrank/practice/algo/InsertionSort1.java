package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertionSort1 {

  public static void insertionSortPart2(int[] ar) {
    int shiftCount = 0;
    for (int i = 1; i < ar.length; i++) {
      int key = ar[i];
      int j = i - 1;
      for (; j >= 0 && ar[j] > key; j--) {
        ar[j + 1] = ar[j];
        shiftCount++;
      }
      ar[j + 1] = key;
    }
    System.out.println(shiftCount);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < t; i++) {
      int n = Integer.parseInt(br.readLine().trim());
      int[] ar = new int[n];
      String input[] = br.readLine().split(" ");
      for (int j = 0; j < input.length; j++) {
        ar[j] = Integer.parseInt(input[j].trim());
      }
      insertionSortPart2(ar);
    }
  }
}
