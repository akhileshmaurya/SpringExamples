package test.hackerrank.practice.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pangrams {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    boolean[] stringStatus = new boolean[26];
    input = input.toUpperCase();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (c >= 'A' && c <= 'Z') {
        int index = (int) c - 65;
        stringStatus[index] = true;
      }
    }
    boolean status = true;
    for (int i = 0; i < stringStatus.length - 1; i++) {
      if (!stringStatus[i]) {
        status = false;
        break;
      }
    }
    if (status) System.out.println("pangram");
    else System.out.println("not pangram");
  }
}
