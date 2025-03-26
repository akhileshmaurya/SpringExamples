package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiggerIsGreater {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String input = br.readLine();
      boolean isPossible = false;
      for (int j = input.length() - 1; j > 0; j--) {
        if (isGreater(input.charAt(j), input.charAt(j - 1))) {
          char c = input.charAt(j - 1);
          int k = findK(j - 1, input);
          // System.out.println("0:"+input);
          input =
              new StringBuffer(input).replace(j - 1, j, String.valueOf(input.charAt(k))).toString();
          // System.out.println("00:"+input);
          input = new StringBuffer(input).replace(k, k + 1, String.valueOf(c)).toString();
          // System.out.println("1:"+input);
          String input1 = input.substring(0, j);
          char[] input2 = input.substring(j).toCharArray();
          Arrays.sort(input2);
          input = input1 + String.valueOf(input2);
          // System.out.println("2:"+input);
          isPossible = true;
          break;
        }
      }
      if (isPossible) System.out.println(input);
      else System.out.println("no answer");
    }
  }

  private static int findK(int j, String input) {
    int k = j + 1;
    for (int i = j + 1; i < input.length(); i++) {
      if ((int) input.charAt(i) < (int) input.charAt(k)
          && (int) input.charAt(i) > (int) input.charAt(j)) {
        k = i;
      }
    }
    return k;
  }

  private static boolean isGreater(char charAt, char charAt2) {
    boolean isGreter = false;
    if ((int) charAt > (int) charAt2) isGreter = true;
    return isGreter;
  }
}
