package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReduction {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String input = br.readLine();
      while (isContainDiffChar(input.trim())) {
        input = trimString(input);
      }
      System.out.println(input.length());
    }
  }

  static String trimString(String input) {
    input = input.replace("ab", "c");
    input = input.replace("ba", "c");
    input = input.replace("ac", "b");
    input = input.replace("ca", "b");
    input = input.replace("bc", "a");
    input = input.replace("cb", "a");
    return input.trim();
  }

  static boolean isContainDiffChar(String s) {
    boolean status = false;
    if (s.length() > 0) {
      char c = s.charAt(0);
      for (int i = 1; i < s.length(); i++) {
        if (c != s.charAt(i)) {
          status = true;
        }
      }
    }
    return status;
  }
}
