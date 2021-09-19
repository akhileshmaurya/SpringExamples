package test.hackerrank.practice.algo;

import java.util.Scanner;

public class InsertionSort2 {

  public static void insertionSortPart2(int[] ar) {

    for (int i = 1; i < ar.length; i++) {
      int key = ar[i];
      int j = i - 1;
      for (; j >= 0 && ar[j] > key; j--) {
        ar[j + 1] = ar[j];
      }
      ar[j + 1] = key;
      printArray(ar);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int s = in.nextInt();
    int[] ar = new int[s];
    for (int i = 0; i < s; i++) {
      ar[i] = in.nextInt();
    }
    insertionSortPart2(ar);
    in.close();
  }

  private static void printArray(int[] ar) {
    for (int n : ar) {
      System.out.print(n + " ");
    }
    System.out.println("");
  }
}
