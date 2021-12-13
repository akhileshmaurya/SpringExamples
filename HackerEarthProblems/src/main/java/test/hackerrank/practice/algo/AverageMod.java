package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageMod {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < t; i++) {
      String[] input1 = br.readLine().trim().split(" ");
      int n = Integer.parseInt(input1[0]);
      int p = Integer.parseInt(input1[1]);
      int k = Integer.parseInt(input1[2]);
      String[] input2 = br.readLine().trim().split(" ");
      int totalSum = 0;
      int pSum = 0;
      int finalSum = 0;
      int m = 0;
      for (int j = 0; j < input2.length; j++) {
        totalSum = totalSum + (Integer.parseInt(input2[j].trim())) % p;
        m++;
        pSum = totalSum;
        if (m >= k) {
          totalSum = totalSum - (Integer.parseInt(input2[j - k + 1].trim())) % p;
        }
        finalSum = max(totalSum, pSum);
      }
      if (finalSum == 0) {
        System.out.println("0 1");
      } else {
        int min = min(n / 2, finalSum / 2);
        if (min == 0) min = min(n, finalSum);
        for (int j = min; j >= 2; j--) {

          while (totalSum % j == 0 && n % j == 0) {
            n = n / j;
            finalSum = finalSum / j;
          }
        }
        System.out.println(finalSum + " " + n);
      }
    }
  }

  private static int min(int i, int j) {
    if (i >= j) return j;
    return i;
  }

  private static int max(int i, int j) {
    if (i >= j) return i;
    return j;
  }
}
