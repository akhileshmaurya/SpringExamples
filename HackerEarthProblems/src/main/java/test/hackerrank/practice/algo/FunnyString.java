package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FunnyString {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String input = br.readLine();
      boolean status = true;
      int start = 0, end = input.length() - 1;
      while (start < end) {
        if (getModuleDiff(input.charAt(start), input.charAt(start + 1))
            != getModuleDiff(input.charAt(end), input.charAt(end - 1))) {
          status = false;
          break;
        }
        start++;
        end--;
      }
      if (status) System.out.println("Funny");
      else System.out.println("Not Funny");
    }
  }

  static int getModuleDiff(char a, char b) {
    int diff = (int) a - (int) b;
    if (diff < 0) diff = diff * (-1);
    return diff;
  }
}
