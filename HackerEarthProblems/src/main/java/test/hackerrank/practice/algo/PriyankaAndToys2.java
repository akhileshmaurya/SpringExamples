package test.hackerrank.practice.algo;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaAndToys2 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int waights[] = new int[n];
    for (int i = 0; i < n; i++) waights[i] = stdin.nextInt();
    Arrays.sort(waights);
    int baseW = waights[0] + 4;
    int answer = 1;
    for (int i = 1; i < waights.length; i++) {
      if (baseW < waights[i]) {
        baseW = waights[i] + 4;
        answer++;
      }
    }
    System.out.println(answer);
  }
}
