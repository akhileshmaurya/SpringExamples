package test.hackerrank.practice.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
  static int pairs(int[] a, int k) {
    int count = 0;
    Arrays.sort(a);
    for (int i = 0; i < a.length - 1; i++) {
      if (Arrays.binarySearch(a, i + 1, a.length, a[i] + k) > 0) count++;
    }
    return count;
  }

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int res;

    String n = in.nextLine();
    String[] n_split = n.split(" ");

    int _a_size = Integer.parseInt(n_split[0]);
    int _k = Integer.parseInt(n_split[1]);

    int[] _a = new int[_a_size];
    int _a_item;
    String next = in.nextLine();
    String[] next_split = next.split(" ");

    for (int _a_i = 0; _a_i < _a_size; _a_i++) {
      _a_item = Integer.parseInt(next_split[_a_i]);
      _a[_a_i] = _a_item;
    }

    res = pairs(_a, _k);
    System.out.println(res);
  }
}
